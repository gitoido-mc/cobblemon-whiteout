package us.timinc.mc.cobblemon.whiteout.fabric

import net.fabricmc.api.ModInitializer
import us.timinc.mc.cobblemon.whiteout.common.Whiteout

object WhiteoutFabric: ModInitializer {
    override fun onInitialize() {
        Whiteout.init()
    }
}
