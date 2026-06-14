package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
public final class zzbzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzs> CREATOR = new zzbzt();

    @SafeParcelable.Field(id = 2)
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzbzs(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws Throwable {
                                Parcelable.Creator<zzbzs> creator = zzbzs.CREATOR;
                                byte[] bArr = bArrMarshall;
                                OutputStream outputStream = autoCloseOutputStream;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            IOUtils.closeQuietly(dataOutputStream2);
                                        } catch (IOException e10) {
                                            e = e10;
                                            dataOutputStream = dataOutputStream2;
                                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                IOUtils.closeQuietly(outputStream);
                                            } else {
                                                IOUtils.closeQuietly(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e10) {
                        e = e10;
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.2");
                        IOUtils.closeQuietly(autoCloseOutputStream);
                    }
                } catch (IOException e11) {
                    e = e11;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i11 = dataInputStream.readInt();
                    byte[] bArr = new byte[i11];
                    dataInputStream.readFully(bArr, 0, i11);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i11);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    IOUtils.closeQuietly(dataInputStream);
                    throw th3;
                }
            } catch (IOException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not read from parcel file descriptor", e10);
                IOUtils.closeQuietly(dataInputStream);
                return null;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}
