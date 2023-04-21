package com.nttdata.presentation.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010\u0082\u0001\u0002\u0016\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/nttdata/presentation/ui/navigation/NavCommand;", "", "screens", "Lcom/nttdata/presentation/ui/navigation/Screens;", "subRoute", "", "navArgs", "", "Lcom/nttdata/presentation/ui/navigation/NavArgs;", "(Lcom/nttdata/presentation/ui/navigation/Screens;Ljava/lang/String;Ljava/util/List;)V", "args", "Landroidx/navigation/NamedNavArgument;", "getArgs", "()Ljava/util/List;", "route", "getRoute", "()Ljava/lang/String;", "getScreens$presentation_debug", "()Lcom/nttdata/presentation/ui/navigation/Screens;", "getSubRoute$presentation_debug", "ContentType", "ContentTypeDetail", "Lcom/nttdata/presentation/ui/navigation/NavCommand$ContentType;", "Lcom/nttdata/presentation/ui/navigation/NavCommand$ContentTypeDetail;", "presentation_debug"})
public abstract class NavCommand {
    @org.jetbrains.annotations.NotNull()
    private final com.nttdata.presentation.ui.navigation.Screens screens = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subRoute = null;
    private final java.util.List<com.nttdata.presentation.ui.navigation.NavArgs> navArgs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<androidx.navigation.NamedNavArgument> args = null;
    
    private NavCommand(com.nttdata.presentation.ui.navigation.Screens screens, java.lang.String subRoute, java.util.List<? extends com.nttdata.presentation.ui.navigation.NavArgs> navArgs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nttdata.presentation.ui.navigation.Screens getScreens$presentation_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubRoute$presentation_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<androidx.navigation.NamedNavArgument> getArgs() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/nttdata/presentation/ui/navigation/NavCommand$ContentType;", "Lcom/nttdata/presentation/ui/navigation/NavCommand;", "screens", "Lcom/nttdata/presentation/ui/navigation/Screens;", "(Lcom/nttdata/presentation/ui/navigation/Screens;)V", "presentation_debug"})
    public static final class ContentType extends com.nttdata.presentation.ui.navigation.NavCommand {
        
        public ContentType(@org.jetbrains.annotations.NotNull()
        com.nttdata.presentation.ui.navigation.Screens screens) {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005\u00a8\u0006\t"}, d2 = {"Lcom/nttdata/presentation/ui/navigation/NavCommand$ContentTypeDetail;", "Lcom/nttdata/presentation/ui/navigation/NavCommand;", "screens", "Lcom/nttdata/presentation/ui/navigation/Screens;", "subRoute", "", "(Lcom/nttdata/presentation/ui/navigation/Screens;Ljava/lang/String;)V", "createRoute", "itemId", "presentation_debug"})
    public static final class ContentTypeDetail extends com.nttdata.presentation.ui.navigation.NavCommand {
        
        public ContentTypeDetail(@org.jetbrains.annotations.NotNull()
        com.nttdata.presentation.ui.navigation.Screens screens, @org.jetbrains.annotations.NotNull()
        java.lang.String subRoute) {
            super(null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(@org.jetbrains.annotations.NotNull()
        java.lang.String itemId) {
            return null;
        }
    }
}