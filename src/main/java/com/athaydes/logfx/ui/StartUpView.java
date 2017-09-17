package com.athaydes.logfx.ui;

import javafx.application.HostServices;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.function.Supplier;

/**
 * The startup view.
 * <p>
 * Shown when no log files are open.
 */
public class StartUpView extends StackPane {

    public StartUpView( HostServices hostServices, Supplier<FileOpener> fileOpenerGetter ) {
        VBox box = new AboutLogFXView( hostServices ).createNode();

        Hyperlink link = new Hyperlink( "Open file (Cmd + O)" );
        link.getStyleClass().add( "large-background-text" );
        link.setOnAction( ( event ) -> fileOpenerGetter.get() );

        box.getChildren().add( link );
        getChildren().addAll( box );
    }

}