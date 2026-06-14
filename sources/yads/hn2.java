package yads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class hn2 implements Parcelable {
    public static final Parcelable.Creator<hn2> CREATOR = new gn2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f111639b;

    public hn2(int i10) {
        this.f111639b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(android.content.Context r8) {
        /*
            r7 = this;
            int r0 = r7.f111639b
            r0 = r0 & 1
            r1 = 2
            r2 = 16
            if (r0 == 0) goto L4c
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r8.getSystemService(r0)
            r0.getClass()
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r3 = r0.getActiveNetworkInfo()
            if (r3 == 0) goto L47
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L47
            int r3 = yads.w83.f117341a
            r4 = 24
            if (r3 >= r4) goto L27
            goto L3a
        L27:
            android.net.Network r3 = r0.getActiveNetwork()
            if (r3 != 0) goto L2e
            goto L47
        L2e:
            android.net.NetworkCapabilities r3 = r0.getNetworkCapabilities(r3)     // Catch: java.lang.SecurityException -> L3a
            if (r3 == 0) goto L47
            boolean r3 = r3.hasCapability(r2)     // Catch: java.lang.SecurityException -> L3a
            if (r3 == 0) goto L47
        L3a:
            int r3 = r7.f111639b
            r3 = r3 & r1
            if (r3 == 0) goto L4c
            boolean r0 = r0.isActiveNetworkMetered()
            if (r0 == 0) goto L4c
            r0 = r1
            goto L4d
        L47:
            int r0 = r7.f111639b
            r0 = r0 & 3
            goto L4d
        L4c:
            r0 = 0
        L4d:
            int r3 = r7.f111639b
            r3 = r3 & 8
            r4 = 0
            if (r3 == 0) goto L71
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r5)
            android.content.Intent r3 = r8.registerReceiver(r4, r3)
            if (r3 != 0) goto L62
            goto L6f
        L62:
            java.lang.String r5 = "status"
            r6 = -1
            int r3 = r3.getIntExtra(r5, r6)
            if (r3 == r1) goto L71
            r1 = 5
            if (r3 != r1) goto L6f
            goto L71
        L6f:
            r0 = r0 | 8
        L71:
            int r1 = r7.f111639b
            r1 = r1 & 4
            if (r1 == 0) goto La3
            java.lang.String r1 = "power"
            java.lang.Object r1 = r8.getSystemService(r1)
            r1.getClass()
            android.os.PowerManager r1 = (android.os.PowerManager) r1
            int r3 = yads.w83.f117341a
            r5 = 23
            if (r3 < r5) goto L8f
            boolean r1 = r1.isDeviceIdleMode()
            if (r1 != 0) goto La3
            goto La1
        L8f:
            r5 = 20
            if (r3 < r5) goto L9a
            boolean r1 = r1.isInteractive()
            if (r1 != 0) goto La1
            goto La3
        L9a:
            boolean r1 = r1.isScreenOn()
            if (r1 != 0) goto La1
            goto La3
        La1:
            r0 = r0 | 4
        La3:
            int r1 = r7.f111639b
            r1 = r1 & r2
            if (r1 == 0) goto Lb8
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r2)
            android.content.Intent r8 = r8.registerReceiver(r4, r1)
            if (r8 != 0) goto Lb6
            goto Lb8
        Lb6:
            r0 = r0 | 16
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hn2.a(android.content.Context):int");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hn2.class == obj.getClass() && this.f111639b == ((hn2) obj).f111639b;
    }

    public final int hashCode() {
        return this.f111639b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f111639b);
    }
}
