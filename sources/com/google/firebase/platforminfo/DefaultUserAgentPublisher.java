package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultUserAgentPublisher implements UserAgentPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GlobalLibraryVersionRegistrar f32942b;

    DefaultUserAgentPublisher(Set set, GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar) {
        this.f32941a = b(set);
        this.f32942b = globalLibraryVersionRegistrar;
    }

    public static /* synthetic */ UserAgentPublisher a(ComponentContainer componentContainer) {
        return new DefaultUserAgentPublisher(componentContainer.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LibraryVersion libraryVersion = (LibraryVersion) it.next();
            sb2.append(libraryVersion.getLibraryName());
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(libraryVersion.getVersion());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public static Component<UserAgentPublisher> component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf((Class<?>) LibraryVersion.class)).factory(new ComponentFactory() { // from class: com.google.firebase.platforminfo.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultUserAgentPublisher.a(componentContainer);
            }
        }).build();
    }

    @Override // com.google.firebase.platforminfo.UserAgentPublisher
    public String getUserAgent() {
        if (this.f32942b.a().isEmpty()) {
            return this.f32941a;
        }
        return this.f32941a + ' ' + b(this.f32942b.a());
    }
}
