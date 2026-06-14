package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ep extends g11 {
    public static final Parcelable.Creator<ep> CREATOR = new dp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f110431c;

    public ep(Parcel parcel) {
        super((String) w83.a((Object) parcel.readString()));
        this.f110431c = (byte[]) w83.a((Object) parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ep.class == obj.getClass()) {
            ep epVar = (ep) obj;
            if (this.f111025b.equals(epVar.f111025b) && Arrays.equals(this.f110431c, epVar.f110431c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f110431c) + j4.a(this.f111025b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111025b);
        parcel.writeByteArray(this.f110431c);
    }

    public ep(String str, byte[] bArr) {
        super(str);
        this.f110431c = bArr;
    }
}
