package q;

import androidx.media3.common.MimeTypes;
import java.util.Set;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f98586a = SetsKt.setOf((Object[]) new String[]{"image/jpeg", MimeTypes.IMAGE_WEBP, MimeTypes.IMAGE_HEIC, MimeTypes.IMAGE_HEIF});

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[l.values().length];
            iArr[l.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[l.IGNORE.ordinal()] = 2;
            iArr[l.RESPECT_ALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(j jVar) {
        return jVar.a() > 0;
    }

    public static final boolean b(j jVar) {
        return jVar.a() == 90 || jVar.a() == 270;
    }

    public static final boolean c(l lVar, String str) {
        int i10 = a.$EnumSwitchMapping$0[lVar.ordinal()];
        if (i10 == 1) {
            return str != null && f98586a.contains(str);
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return true;
        }
        throw new lf.m();
    }
}
