package com.dua.dailyduaapp;

public class Dua {
    // 1. Pehle hum variables banate hain
    private String name;
    private String purpose;
    private String arabic;
    private String translation;

    // 2. Phir "Constructor" banate hain (Data bharne ke liye)
    public Dua(String name, String purpose, String arabic, String translation) {
        this.name = name;
        this.purpose = purpose;
        this.arabic = arabic;
        this.translation = translation;
    }

    // 3. Phir "Getters" banate hain (Data wapis lene ke liye)
    public String getName() { return name; }
    public String getPurpose() { return purpose; }
    public String getArabic() { return arabic; }
    public String getTranslation() { return translation; }
}