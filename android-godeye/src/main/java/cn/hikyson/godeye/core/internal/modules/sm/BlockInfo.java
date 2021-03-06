package cn.hikyson.godeye.core.internal.modules.sm;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import cn.hikyson.godeye.core.internal.modules.sm.core.LongBlockInfo;
import cn.hikyson.godeye.core.internal.modules.sm.core.ShortBlockInfo;

/**
 * Created by kysonchao on 2017/11/22.
 */
public class BlockInfo {
    public LongBlockInfo longBlockInfo;
    public ShortBlockInfo shortBlockInfo;
    public @BlockType
    String blockType;

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BlockType.LONG, BlockType.SHORT})
    public @interface BlockType {
        public static final String LONG = "LongBlock";
        public static final String SHORT = "ShortBlock";
    }

    public BlockInfo(LongBlockInfo longBlockInfo) {
        this.longBlockInfo = longBlockInfo;
        this.blockType = BlockType.LONG;
    }

    public BlockInfo(ShortBlockInfo shortBlockInfo) {
        this.shortBlockInfo = shortBlockInfo;
        this.blockType = BlockType.SHORT;
    }

    @Override
    public String toString() {
        return "BlockInfo{" +
                "longBlockInfo=" + longBlockInfo +
                ", shortBlockInfo=" + shortBlockInfo +
                ", blockType='" + blockType + '\'' +
                '}';
    }
}
