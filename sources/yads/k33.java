package yads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Ascii;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class k33 extends g11 {
    public static final Parcelable.Creator<k33> CREATOR = new j33();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f112576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f112577d;

    public k33(Parcel parcel) {
        super((String) w83.a((Object) parcel.readString()));
        this.f112576c = parcel.readString();
        this.f112577d = (String) w83.a((Object) parcel.readString());
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k33.class == obj.getClass()) {
            k33 k33Var = (k33) obj;
            if (w83.a(this.f111025b, k33Var.f111025b) && w83.a(this.f112576c, k33Var.f112576c) && w83.a(this.f112577d, k33Var.f112577d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = j4.a(this.f111025b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f112576c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f112577d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // yads.g11
    public final String toString() {
        return this.f111025b + ": description=" + this.f112576c + ": value=" + this.f112577d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f111025b);
        parcel.writeString(this.f112576c);
        parcel.writeString(this.f112577d);
    }

    public k33(String str, String str2, String str3) {
        super(str);
        this.f112576c = str2;
        this.f112577d = str3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.g11, yads.er1
    public final void a(uk1 uk1Var) {
        byte b10;
        String str = this.f111025b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                b10 = !str.equals("TAL") ? (byte) -1 : (byte) 0;
                break;
            case 82878:
                b10 = !str.equals("TCM") ? (byte) -1 : (byte) 1;
                break;
            case 82897:
                b10 = !str.equals("TDA") ? (byte) -1 : (byte) 2;
                break;
            case 83253:
                b10 = !str.equals("TP1") ? (byte) -1 : (byte) 3;
                break;
            case 83254:
                b10 = !str.equals("TP2") ? (byte) -1 : (byte) 4;
                break;
            case 83255:
                b10 = !str.equals("TP3") ? (byte) -1 : (byte) 5;
                break;
            case 83341:
                b10 = !str.equals("TRK") ? (byte) -1 : (byte) 6;
                break;
            case 83378:
                b10 = !str.equals("TT2") ? (byte) -1 : (byte) 7;
                break;
            case 83536:
                b10 = !str.equals("TXT") ? (byte) -1 : (byte) 8;
                break;
            case 83552:
                b10 = !str.equals("TYE") ? (byte) -1 : (byte) 9;
                break;
            case 2567331:
                b10 = !str.equals("TALB") ? (byte) -1 : (byte) 10;
                break;
            case 2569357:
                b10 = !str.equals("TCOM") ? (byte) -1 : Ascii.VT;
                break;
            case 2569891:
                b10 = !str.equals("TDAT") ? (byte) -1 : Ascii.FF;
                break;
            case 2570401:
                b10 = !str.equals("TDRC") ? (byte) -1 : (byte) 13;
                break;
            case 2570410:
                b10 = !str.equals("TDRL") ? (byte) -1 : Ascii.SO;
                break;
            case 2571565:
                b10 = !str.equals(AdPreferences.TYPE_TEXT) ? (byte) -1 : Ascii.SI;
                break;
            case 2575251:
                b10 = !str.equals("TIT2") ? (byte) -1 : Ascii.DLE;
                break;
            case 2581512:
                b10 = !str.equals("TPE1") ? (byte) -1 : (byte) 17;
                break;
            case 2581513:
                b10 = !str.equals("TPE2") ? (byte) -1 : Ascii.DC2;
                break;
            case 2581514:
                b10 = !str.equals("TPE3") ? (byte) -1 : (byte) 19;
                break;
            case 2583398:
                b10 = !str.equals("TRCK") ? (byte) -1 : Ascii.DC4;
                break;
            case 2590194:
                b10 = !str.equals("TYER") ? (byte) -1 : Ascii.NAK;
                break;
            default:
                b10 = -1;
                break;
        }
        try {
            switch (b10) {
                case 0:
                case 10:
                    uk1Var.f116679c = this.f112577d;
                    break;
                case 1:
                case 11:
                    uk1Var.f116700x = this.f112577d;
                    break;
                case 2:
                case 12:
                    int i10 = Integer.parseInt(this.f112577d.substring(2, 4));
                    int i11 = Integer.parseInt(this.f112577d.substring(0, 2));
                    uk1Var.f116694r = Integer.valueOf(i10);
                    uk1Var.f116695s = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    uk1Var.f116678b = this.f112577d;
                    break;
                case 4:
                case 18:
                    uk1Var.f116680d = this.f112577d;
                    break;
                case 5:
                case 19:
                    uk1Var.f116701y = this.f112577d;
                    break;
                case 6:
                case 20:
                    String str2 = this.f112577d;
                    int i12 = w83.f117341a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    uk1Var.f116689m = Integer.valueOf(i13);
                    uk1Var.f116690n = numValueOf;
                    break;
                case 7:
                case 16:
                    uk1Var.f116677a = this.f112577d;
                    break;
                case 8:
                case 15:
                    uk1Var.f116699w = this.f112577d;
                    break;
                case 9:
                case 21:
                    uk1Var.f116693q = Integer.valueOf(Integer.parseInt(this.f112577d));
                    break;
                case 13:
                    ArrayList arrayListA = a(this.f112577d);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                uk1Var.f116695s = (Integer) arrayListA.get(2);
                            }
                        }
                        uk1Var.f116694r = (Integer) arrayListA.get(1);
                    }
                    uk1Var.f116693q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(this.f112577d);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                uk1Var.f116698v = (Integer) arrayListA2.get(2);
                            }
                        }
                        uk1Var.f116697u = (Integer) arrayListA2.get(1);
                    }
                    uk1Var.f116696t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
