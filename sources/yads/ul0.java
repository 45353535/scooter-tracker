package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f116706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f116707b;

    public ul0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f116706a = byteArrayOutputStream;
        this.f116707b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(sl0 sl0Var) {
        this.f116706a.reset();
        try {
            DataOutputStream dataOutputStream = this.f116707b;
            dataOutputStream.writeBytes(sl0Var.f115856b);
            dataOutputStream.writeByte(0);
            String str = sl0Var.f115857c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f116707b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f116707b.writeLong(sl0Var.f115858d);
            this.f116707b.writeLong(sl0Var.f115859e);
            this.f116707b.write(sl0Var.f115860f);
            this.f116707b.flush();
            return this.f116706a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
