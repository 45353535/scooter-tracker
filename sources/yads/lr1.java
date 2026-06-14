package yads;

import androidx.core.view.ViewCompat;
import androidx.media3.common.MimeTypes;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f113193a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static zw a(int i10, w92 w92Var) {
        int iB = w92Var.b();
        if (w92Var.b() == 1684108385) {
            w92Var.e(w92Var.f117357b + 8);
            String strB = w92Var.b(iB - 16);
            return new zw("und", strB, strB);
        }
        uf1.d("MetadataUtil", "Failed to parse comment attribute: " + pj.a(i10));
        return null;
    }

    public static kb1 b(int i10, w92 w92Var) {
        String strB = null;
        String strB2 = null;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            int i13 = w92Var.f117357b;
            if (i13 >= i10) {
                break;
            }
            int iB = w92Var.b();
            int iB2 = w92Var.b();
            w92Var.e(w92Var.f117357b + 4);
            if (iB2 == 1835360622) {
                strB = w92Var.b(iB - 12);
            } else if (iB2 == 1851878757) {
                strB2 = w92Var.b(iB - 12);
            } else {
                if (iB2 == 1684108385) {
                    i11 = i13;
                    i12 = iB;
                }
                w92Var.e(w92Var.f117357b + (iB - 12));
            }
        }
        if (strB == null || strB2 == null || i11 == -1) {
            return null;
        }
        w92Var.e(i11);
        w92Var.e(w92Var.f117357b + 16);
        return new kb1(strB, strB2, w92Var.b(i12 - 16));
    }

    public static tf a(w92 w92Var) {
        String str;
        int iB = w92Var.b();
        if (w92Var.b() == 1684108385) {
            int iB2 = w92Var.b() & ViewCompat.MEASURED_SIZE_MASK;
            if (iB2 == 13) {
                str = "image/jpeg";
            } else {
                str = iB2 == 14 ? MimeTypes.IMAGE_PNG : null;
            }
            if (str == null) {
                vd1.a("Unrecognized cover art flags: ", iB2, "MetadataUtil");
                return null;
            }
            w92Var.e(w92Var.f117357b + 4);
            int i10 = iB - 16;
            byte[] bArr = new byte[i10];
            w92Var.a(bArr, 0, i10);
            return new tf(str, null, 3, bArr);
        }
        uf1.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static k33 b(int i10, w92 w92Var, String str) {
        int iB = w92Var.b();
        if (w92Var.b() == 1684108385) {
            w92Var.e(w92Var.f117357b + 8);
            return new k33(str, null, w92Var.b(iB - 16));
        }
        uf1.d("MetadataUtil", "Failed to parse text attribute: " + pj.a(i10));
        return null;
    }

    public static k33 a(int i10, w92 w92Var, String str) {
        int iB = w92Var.b();
        if (w92Var.b() == 1684108385 && iB >= 22) {
            w92Var.e(w92Var.f117357b + 10);
            int iR = w92Var.r();
            if (iR > 0) {
                String strA = he2.a("", iR);
                int iR2 = w92Var.r();
                if (iR2 > 0) {
                    strA = strA + "/" + iR2;
                }
                return new k33(str, null, strA);
            }
        }
        uf1.d("MetadataUtil", "Failed to parse index/count attribute: " + pj.a(i10));
        return null;
    }

    public static g11 a(int i10, String str, w92 w92Var, boolean z10, boolean z11) {
        int iMin;
        w92Var.e(w92Var.f117357b + 4);
        if (w92Var.b() == 1684108385) {
            w92Var.e(w92Var.f117357b + 8);
            iMin = w92Var.m();
        } else {
            uf1.d("MetadataUtil", "Failed to parse uint8 attribute value");
            iMin = -1;
        }
        if (z11) {
            iMin = Math.min(1, iMin);
        }
        if (iMin >= 0) {
            if (z10) {
                return new k33(str, null, Integer.toString(iMin));
            }
            return new zw("und", str, Integer.toString(iMin));
        }
        uf1.d("MetadataUtil", "Failed to parse uint8 attribute: " + pj.a(i10));
        return null;
    }
}
