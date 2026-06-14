package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(30)
final class ColorResourcesLoaderCreator {
    static ResourcesLoader a(Context context, Map map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrJ = ColorResourcesTableCreator.j(context, map);
            Log.i("ColorResLoaderCreator", "Table created, length: " + bArrJ.length);
            if (bArrJ.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
            } catch (Throwable th2) {
                th = th2;
                fileDescriptorMemfd_create = null;
            }
            try {
                if (fileDescriptorMemfd_create == null) {
                    Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                    if (fileDescriptorMemfd_create == null) {
                        return null;
                    }
                    Os.close(fileDescriptorMemfd_create);
                    return null;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                try {
                    fileOutputStream.write(bArrJ);
                    ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                    try {
                        e.a();
                        ResourcesLoader resourcesLoaderA = d.a();
                        resourcesLoaderA.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                        if (parcelFileDescriptorDup != null) {
                            parcelFileDescriptorDup.close();
                        }
                        fileOutputStream.close();
                        Os.close(fileDescriptorMemfd_create);
                        return resourcesLoaderA;
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileDescriptorMemfd_create != null) {
                    Os.close(fileDescriptorMemfd_create);
                }
                throw th;
            }
        } catch (Exception e10) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", e10);
            return null;
        }
    }
}
