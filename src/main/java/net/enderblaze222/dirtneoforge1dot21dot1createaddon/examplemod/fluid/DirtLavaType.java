package net.enderblaze222.dirtneoforge1dot21dot1createaddon.examplemod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidType;
import java.util.function.Consumer;

public class DirtLavaType extends FluidType {
    public DirtLavaType() {
        super(Properties.create()...); // Configure properties here
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return new ResourceLocation("dirtmod", "block/dirt_lava_still");
            }
            // Add other overrides here
        });
    }
}