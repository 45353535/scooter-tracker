package da;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f68527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f68528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f68529c;

    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return j.this.f68528b.a(bundle);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68531a = new b() { // from class: da.k
            @Override // da.j.b
            public final Bundle a(Bundle bundle) {
                return l.a(bundle);
            }
        };

        Bundle a(Bundle bundle);
    }

    public j() {
        this(b.f68531a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f68529c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            q9.a.g(this.f68527a.add(mediaCodec));
        }
    }

    public void c() {
        this.f68527a.clear();
        LoudnessCodecController loudnessCodecController = this.f68529c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f68527a.remove(mediaCodec) || (loudnessCodecController = this.f68529c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f68529c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f68529c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, MoreExecutors.directExecutor(), new a());
        this.f68529c = loudnessCodecControllerCreate;
        Iterator it = this.f68527a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public j(b bVar) {
        this.f68527a = new HashSet();
        this.f68528b = bVar;
    }
}
