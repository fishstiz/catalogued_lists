package io.github.fishstiz.catalogued_lists.platform;

import io.github.fishstiz.catalogued_lists.platform.services.PlatformHelper;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class NeoForgePlatformHelper implements PlatformHelper {
    @Override
    public Path getConfigDir() {
        return FMLPaths.CONFIGDIR.get();
    }
}