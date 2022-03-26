package tech.thatgravyboat.playdate.common.blocks.toys;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
import tech.thatgravyboat.playdate.common.blocks.EightDirectionProperty;

import java.util.function.Supplier;

public class PlushieBlock extends Block implements BlockEntityProvider {

    public static final EightDirectionProperty FACING = new EightDirectionProperty();

    public static final VoxelShape SHAPE = Block.createCuboidShape(2.5, 0, 2.5, 13.5, 14, 13.5);

    private final Supplier<BlockEntityType<? extends BlockEntity>> blockEntityType;

    public PlushieBlock(Supplier<BlockEntityType<? extends BlockEntity>> blockEntityType, Settings settings) {
        super(settings);
        this.blockEntityType = blockEntityType;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        var value = EightDirectionProperty.Direction.VALUES[MathHelper.floor((double) (ctx.getPlayerYaw() * 8.0F / 360.0F) + 0.5D) & 7];
        return this.getDefaultState().with(FACING, value);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return this.blockEntityType.get().instantiate(pos, state);
    }
}
