package com.tayjay.energyoverload;

import com.tayjay.energyoverload.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Taylar on 28/08/2015.
 */

@Mod(modid = "EnergyOverload", name = "Energy Overload", version = "1.7.10-0.1")
public class EnergyOverload
{
    @Mod.Instance("EnergyOverload")
    public static EnergyOverload instance;

    @SidedProxy(clientSide = "com.tayjay.energyoverload.ClientProxy", serverSide = "com.tayjay.energyoverload.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
