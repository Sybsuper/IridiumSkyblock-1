package com.iridium.iridiumskyblock.configs;

public class Messages extends com.iridium.iridiumteams.configs.Messages {

    public Messages() {
        super("Island", "is", "IridiumSkyblock", "&9");
    }

    public String voidTeleport = "%prefix% &7You have fallen off your island. Teleporting home...";
    public String netherIslandsDisabled = "%prefix% &7Nether islands have been disabled.";
    public String netherLocked = "%prefix% &7Reach Island level %level% to unlock the Nether.";
    public String islandBorderChanged = "%prefix% &7%player% has changed your Island border to %color%.";
    public String borderColorDisabled = "%prefix% &7That border color has been disabled.";
    public String notAColor = "%prefix% &7That is not a valid color.";
    public String cannotManageBorder = "%prefix% &7You cannot change the Island Border.";
    public String regeneratingIsland = "%prefix% &7Regenerating Island...";
    public String cannotRegenIsland = "%prefix% &7You cannot regenerate your Island.";
    public String unknownSchematic = "%prefix% &7No schematic with that name exists.";
    public String noSafeLocation = "%prefix% &7Could not find a safe location to teleport to.";
    public String cannotHurtPlayers = "%prefix% &7You cannot hurt players on your Island.";
}
