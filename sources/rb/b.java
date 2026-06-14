package rb;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f99345d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableSet f99346e = ImmutableSet.of("auto", "none");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ImmutableSet f99347f = ImmutableSet.of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImmutableSet f99348g = ImmutableSet.of("filled", "open");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImmutableSet f99349h = ImmutableSet.of("after", "before", "outside");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99352c;

    private b(int i10, int i11, int i12) {
        this.f99350a = i10;
        this.f99351b = i11;
        this.f99352c = i12;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.copyOf(TextUtils.split(lowerCase, f99345d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static rb.b b(com.google.common.collect.ImmutableSet r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.b.b(com.google.common.collect.ImmutableSet):rb.b");
    }
}
