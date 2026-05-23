plugins {
    id("architectury-plugin")
    id("dev.architectury.loom")
}

architectury {
    common(
        "neoforge",
        "fabric"
    )
}

val modId: String by project

loom {
    silentMojangMappingsLicense()
    accessWidenerPath.set(project(":common").file("src/main/resources/${modId}-common.accesswidener"))
}

dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings(loom.officialMojangMappings())

    modImplementation("com.cobblemon:mod:${property("cobblemon_version")}") {
        isTransitive = false
    }

    testImplementation("org.junit.jupiter:junit-jupiter-api:${property("junit_version")}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${property("junit_version")}")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
