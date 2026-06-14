package kotlinx.serialization.descriptors;

import java.util.List;
import wg.l;

/* JADX INFO: loaded from: classes3.dex */
public interface SerialDescriptor {
    boolean b();

    int c(String str);

    SerialDescriptor d(int i10);

    int e();

    String f(int i10);

    List g(int i10);

    List getAnnotations();

    l getKind();

    String h();

    boolean i(int i10);

    boolean isInline();
}
