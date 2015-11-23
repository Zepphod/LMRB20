package com.zepphod.lmrb20;

import com.zepphod.lmrb20.proxy.IProxy;
import com.zepphod.lmrb20.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zepphod on 23/11/2015.
 */

@Mod(modid = "LMRB20", name = "LMRB 2.0", version ="1.7.10-0.01")
public class LMRB20 {

    @Mod.Instance("LMRB20")
    public static LMRB20 instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {

    }

}
