package applemilktea3.common.block;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.RotatedPillarBlock;

public class WoodBoxBlock extends RotatedPillarBlock {
    public WoodBoxBlock(Properties p_55926_) {
        super(p_55926_);
        this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
    }
}
