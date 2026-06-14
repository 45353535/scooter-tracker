package za;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f119332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f119333b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f119332a = byteArrayOutputStream;
        this.f119333b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f119332a.reset();
        try {
            b(this.f119333b, aVar.f119326a);
            String str = aVar.f119327b;
            if (str == null) {
                str = "";
            }
            b(this.f119333b, str);
            this.f119333b.writeLong(aVar.f119328c);
            this.f119333b.writeLong(aVar.f119329d);
            this.f119333b.write(aVar.f119330e);
            this.f119333b.flush();
            return this.f119332a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
