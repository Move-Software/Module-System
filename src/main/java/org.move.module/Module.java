package org.move.module;

import org.move.module.Category;

public class Module {

    public String name;
    public String description;
    public boolean toggled;
    public Category category;

    public Module(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        setToggled(toggled);
    }

    public void onEnable() {}
    public void onDisable() {}

    public void toggle() {
        this.toggled = !toggled;
        if(toggled) {
            onEnable();
            // Register the class with your eventmanger here
        } else {
            onDisable();
            // Unregister the class with your eventmanger here
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isToggled() {
        return toggled;
    }

    public void setToggled(boolean toggled) {
        this.toggled = toggled;
    }
}