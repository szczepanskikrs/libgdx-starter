import Versions.gdxVersion

object Dependencies {
    object Kotlin {
        const val stdLib = "stdlib"
    }

    object Classpath {
        const val ktLint = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktLint}"
    }

    object GDX {
        object Core {
            const val box2d = "com.badlogicgames.gdx:gdx-box2d:$gdxVersion"
            const val controllers = "com.badlogicgames.gdx:gdx-controllers:$gdxVersion"
            const val core = "com.badlogicgames.gdx:gdx:$gdxVersion"
        }

        object Desktop {
            const val backendLwjgl = "com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion"
            const val platform = "com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop"
            const val box2DPlatform = "com.badlogicgames.gdx:gdx-box2d-platform:$gdxVersion:natives-desktop"
            const val controllersDesktop = "com.badlogicgames.gdx:gdx-controllers-desktop:$gdxVersion"
            const val controllersPlatform = "com.badlogicgames.gdx:gdx-controllers-platform:$gdxVersion:natives-desktop"
        }
    }

    object Testing {
        const val testNg = "org.testng:testng:${Versions.testNg}"
    }
}
