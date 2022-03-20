package org.move.module;

public class ModuleManager {

    public ArrayList<Module> modules = new ArrayList<>();
    
    // Add this method to your start method in main class
    public void register() {
        modules.add(new TestMod());
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

}