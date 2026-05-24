package com.mojang.text2speech;

public enum OperatingSystem {
    WINDOWS, OSX, LINUX, UNKNOWN;

    public static OperatingSystem get () {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) return WINDOWS;
        if (os.contains("mac")) return OSX;
        if (os.contains("nix") || os.contains("nix")) return  LINUX;
        return UNKNOWN;
    }
}