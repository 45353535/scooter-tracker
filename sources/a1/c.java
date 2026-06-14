package a1;

import androidx.collection.SieveCacheKt;

/* JADX INFO: loaded from: classes6.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f3371b;

    c(long j10, int i10) {
        this.f3371b = j10;
        this.f3370a = i10;
    }

    static c b(String str, int i10, int i11) {
        long j10;
        int i12;
        if (i10 >= i11) {
            return null;
        }
        long j11 = 0;
        int i13 = i10;
        while (i13 < i11) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j10 = j11 * 16;
                    i12 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j10 = j11 * 16;
                    i12 = cCharAt - 'a';
                }
                j11 = j10 + ((long) i12) + 10;
            } else {
                j11 = (j11 * 16) + ((long) (cCharAt - '0'));
            }
            if (j11 > 4294967295L) {
                return null;
            }
            i13++;
        }
        if (i13 == i10) {
            return null;
        }
        return new c(j11, i13);
    }

    static c c(String str, int i10, int i11, boolean z10) {
        if (i10 >= i11) {
            return null;
        }
        boolean z11 = false;
        if (z10) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '+') {
                i10++;
            } else if (cCharAt == '-') {
                z11 = true;
                i10++;
            }
        }
        long j10 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            if (z11) {
                j10 = (j10 * 10) - ((long) (cCharAt2 - '0'));
                if (j10 < SieveCacheKt.NodeMetaAndPreviousMask) {
                    return null;
                }
            } else {
                j10 = (j10 * 10) + ((long) (cCharAt2 - '0'));
                if (j10 > SieveCacheKt.NodeLinkMask) {
                    return null;
                }
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new c(j10, i12);
    }

    int a() {
        return this.f3370a;
    }

    public int d() {
        return (int) this.f3371b;
    }
}
