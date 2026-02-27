package com.dua.dailyduaapp;

import java.util.ArrayList;
import java.util.List;

public class DuaData {
    public static List<Dua> getAllDuas() {
        List<Dua> list = new ArrayList<>();

        // Yahan hum 20 Duas add kar rahe hain
        list.add(new Dua("Sone ki Dua", "Sone se pehle", "بِاسْمِكَ اللَّهُمَّ أَمُوتُ وَأَحْيَا", "O Allah, in Your name I die and I live."));
        list.add(new Dua("Uthne ki Dua", "Subha uthte waqt", "الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ", "All praise to Allah who gave us life after death."));
        list.add(new Dua("Khane ki Dua", "Khana shuru karte waqt", "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ", "In the name of Allah and with the blessings of Allah."));
        list.add(new Dua("Khane ke baad", "Khana khatam karne par", "الْحَمْدُ لِلَّهِ الَّذِي أَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِينَ", "Praise be to Allah who fed us and made us Muslims."));
        list.add(new Dua("Ghar se nikalne ki", "Bahar jate waqt", "بِسْمِ اللَّهِ تَوَكَّلْتُ عَلَى اللَّهِ", "In the name of Allah, I place my trust in Allah."));
        list.add(new Dua("Ghar mein dakhil hone ki", "Wapsi par", "بِسْمِ اللهِ وَلَجْنَا، وَبِسْمِ اللهِ خَرَجْنَا", "In the name of Allah we enter and leave."));
        list.add(new Dua("Masjid dakhil hone ki", "Dakhly waqt", "اللَّهُمَّ افْتَحْ لِي أَبْوَابَ رَحْمَتِكَ", "O Allah, open for me the gates of Your mercy."));
        list.add(new Dua("Masjid se nikalne ki", "Bahar aate waqt", "اللَّهُمَّ إِنِّي أَسْأَلُكَ مِنْ فَضْلِكَ", "O Allah, I ask You from Your favor."));
        list.add(new Dua("Safar ki Dua", "Travel shuru karte waqt", "سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَذَا", "Glory be to Him who has brought this under our control."));
        list.add(new Dua("Ilm mein izafa", "Parhai ke liye", "رَّبِّ زِدْنِي عِلْمًا", "My Lord, increase me in knowledge."));
        list.add(new Dua("Maa Baap ke liye", "Walidain ke liye", "رَّبِّ ارْحَمْهُمَا كَمَا رَبَّيَانِي صَغِيرًا", "My Lord, have mercy on them both."));
        list.add(new Dua("Mushkil ke waqt", "Pareshani mein", "حَسْبُنَا اللَّهُ وَنِعْمَ الْوَكِيلُ", "Allah is sufficient for us."));
        list.add(new Dua("Aina dekhne ki", "Beauty dua", "اللَّهُمَّ أَنْتَ حَسَّنْتَ خَلْقِي فَحَسِّنْ خُلُقِي", "O Allah, make my character beautiful."));
        list.add(new Dua("Wuzu se pehle", "Shuruat mein", "بِسْمِ اللَّهِ", "In the name of Allah."));
        list.add(new Dua("Wuzu ke baad", "Finish karne par", "أَشْهَدُ أَنْ لَا إِلَهَ إِلَّا اللَّهُ", "I bear witness there is no God but Allah."));
        list.add(new Dua("Baitul Khala mein dakhila", "Toilet entry", "اللَّهُمَّ إِنِّي أَعُوذُ بِكَ مِنَ الْخُبُثِ", "O Allah, I seek refuge from devils."));
        list.add(new Dua("Baitul Khala se nikalna", "Toilet exit", "غُفْرَانَكَ", "I seek Your forgiveness."));
        list.add(new Dua("Naya Libas pehnana", "New clothes", "الْحَمْدُ لِلَّهِ الَّذِي كَسَانِي هَذَا", "Praise to Allah who clothed me."));
        list.add(new Dua("Istighfar", "Toba", "أَسْتَغْفِرُ اللَّهَ", "I seek forgiveness from Allah."));
        list.add(new Dua("Shukr ki Dua", "Thanksgiving", "الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ", "All praise is for Allah."));

        return list;
    }
}