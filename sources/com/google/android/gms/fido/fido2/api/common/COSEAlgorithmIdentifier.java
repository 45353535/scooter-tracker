package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();

    @NonNull
    private final Algorithm zza;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    COSEAlgorithmIdentifier(@NonNull Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    @NonNull
    public static COSEAlgorithmIdentifier fromCoseValue(int i10) throws UnsupportedAlgorithmIdentifierException {
        Algorithm algorithm;
        if (i10 == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            algorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] rSAAlgorithmArrValues = RSAAlgorithm.values();
            int length = rSAAlgorithmArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                        if (eC2Algorithm.getAlgoValue() == i10) {
                            algorithm = eC2Algorithm;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(i10);
                }
                RSAAlgorithm rSAAlgorithm = rSAAlgorithmArrValues[i11];
                if (rSAAlgorithm.getAlgoValue() == i10) {
                    algorithm = rSAAlgorithm;
                    break;
                }
                i11++;
            }
        }
        return new COSEAlgorithmIdentifier(algorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@NonNull Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
