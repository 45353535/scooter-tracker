package com.bykv.vk.openvk.preload.geckox.a.a;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class e extends b {
    e() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        Iterator<String> it = this.f15735e.iterator();
        while (it.hasNext()) {
            List<File> listB = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.f15734d, it.next()));
            if (listB != null && listB.size() > this.f15733c.f15725a) {
                for (File file : listB.subList(0, listB.size() - this.f15733c.f15725a)) {
                    com.bykv.vk.openvk.preload.geckox.a.c.b(file.getAbsolutePath());
                    if (this.f15733c.f15726b != null) {
                        file.getName();
                    }
                }
            }
        }
    }
}
