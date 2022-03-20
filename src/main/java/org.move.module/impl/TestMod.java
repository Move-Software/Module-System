package org.move.module.impl;

import org.move.module.Category;

public class TestMod extends Module {

    public TestMod() {
        super("TestMod", "Testing a module", Category.RENDER);
    }

    @Override
    public void onEnable() {
        System.out.println("TestMod enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("TestMod disabled");
    }

}