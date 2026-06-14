package yads;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class if1 {
    public static String a(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb2.append('-');
            sb2.append(script);
        }
        if (country != null && country.length() != 0) {
            sb2.append('_');
            sb2.append(country);
        }
        return sb2.toString();
    }
}
