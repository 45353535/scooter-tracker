package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b implements ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f97908a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InheritableThreadLocal f97909b = new a();

    class a extends InheritableThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
