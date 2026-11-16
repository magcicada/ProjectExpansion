package cool.furry.mc.forge.projectexpansion.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ClientConfig {
    public static final ForgeConfigSpec Spec;
    public static final ForgeConfigSpec.IntValue emcDisplayX;
    public static final ForgeConfigSpec.IntValue emcDisplayY;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("hud");
        emcDisplayX = builder.comment("Horizontal EMC HUD offset from the top-left origin (2, 2), in GUI-scaled pixels. Positive moves right.")
                .defineInRange("emcDisplayX", 0, -32768, 32767);
        emcDisplayY = builder.comment("Vertical EMC HUD offset from the top-left origin (2, 2), in GUI-scaled pixels. Positive moves down. Default leaves room for an FPS row.")
                .defineInRange("emcDisplayY", 12, -32768, 32767);
        builder.pop();
        Spec = builder.build();
    }

    private ClientConfig() {
    }
}
