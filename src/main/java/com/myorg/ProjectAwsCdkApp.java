package com.myorg;

import software.amazon.awscdk.App;

public class ProjectAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        new VpcStack(app, "Vpc");

        app.synth();
    }
}