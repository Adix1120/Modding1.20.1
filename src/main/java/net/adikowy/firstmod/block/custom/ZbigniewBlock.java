package net.adikowy.firstmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
public class ZbigniewBlock extends Block
{
    private final int signalStrength;

    public ZbigniewBlock(Properties properties, int signalStrength)
    {
        super(properties);
        this.signalStrength = signalStrength;
    }

    @Override
    public boolean isSignalSource(BlockState state)
    {
        return true;
    }

    @Override
    public int getSignal(BlockState state, BlockGetter level, BlockPos pos, net.minecraft.core.Direction direction)
    {
        return signalStrength;
    }
}