mvn clean compile sonar:sonar -Dsonar.host.url=http://192.168.1.100:9000 -Dsonar.sourceEncoding=UTF-8 -Dsonar.sources=. -Dsonar.inclusions=src/main/** -X

sonar-mybatis插件版本：1.0.4 
<br />
sonarqube版本：7.9.1 
<br />
扫描环境：windows 
<br />

maven扫描报错详细信息如下：
Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-25T03:49:05+08:00)
Maven home: D:\develop\apache-maven-3.5.3\bin\..
Java version: 1.8.0_111, vendor: Oracle Corporation
Java home: C:\Java\Java8\jdk1.8.0_111\jre
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 7", version: "6.1", arch: "amd64", family: "windows"
[DEBUG] Created new class realm maven.api
[DEBUG] Importing foreign packages into class realm maven.api
[DEBUG]   Imported: javax.annotation.* < plexus.core
[DEBUG]   Imported: javax.annotation.security.* < plexus.core
[DEBUG]   Imported: javax.enterprise.inject.* < plexus.core
[DEBUG]   Imported: javax.enterprise.util.* < plexus.core
[DEBUG]   Imported: javax.inject.* < plexus.core
[DEBUG]   Imported: org.apache.maven.* < plexus.core
[DEBUG]   Imported: org.apache.maven.artifact < plexus.core
[DEBUG]   Imported: org.apache.maven.classrealm < plexus.core
[DEBUG]   Imported: org.apache.maven.cli < plexus.core
[DEBUG]   Imported: org.apache.maven.configuration < plexus.core
[DEBUG]   Imported: org.apache.maven.exception < plexus.core
[DEBUG]   Imported: org.apache.maven.execution < plexus.core
[DEBUG]   Imported: org.apache.maven.execution.scope < plexus.core
[DEBUG]   Imported: org.apache.maven.lifecycle < plexus.core
[DEBUG]   Imported: org.apache.maven.model < plexus.core
[DEBUG]   Imported: org.apache.maven.monitor < plexus.core
[DEBUG]   Imported: org.apache.maven.plugin < plexus.core
[DEBUG]   Imported: org.apache.maven.profiles < plexus.core
[DEBUG]   Imported: org.apache.maven.project < plexus.core
[DEBUG]   Imported: org.apache.maven.reporting < plexus.core
[DEBUG]   Imported: org.apache.maven.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.rtinfo < plexus.core
[DEBUG]   Imported: org.apache.maven.settings < plexus.core
[DEBUG]   Imported: org.apache.maven.toolchain < plexus.core
[DEBUG]   Imported: org.apache.maven.usability < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.* < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authentication < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authorization < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.events < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.observers < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.proxy < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.resource < plexus.core
[DEBUG]   Imported: org.codehaus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.* < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.component < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.configuration < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.container < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.context < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.lifecycle < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.logging < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.personality < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.Xpp3Dom < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParser < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParserException < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlSerializer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.* < plexus.core
[DEBUG]   Imported: org.eclipse.aether.artifact < plexus.core
[DEBUG]   Imported: org.eclipse.aether.collection < plexus.core
[DEBUG]   Imported: org.eclipse.aether.deployment < plexus.core
[DEBUG]   Imported: org.eclipse.aether.graph < plexus.core
[DEBUG]   Imported: org.eclipse.aether.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.installation < plexus.core
[DEBUG]   Imported: org.eclipse.aether.internal.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.metadata < plexus.core
[DEBUG]   Imported: org.eclipse.aether.repository < plexus.core
[DEBUG]   Imported: org.eclipse.aether.resolution < plexus.core
[DEBUG]   Imported: org.eclipse.aether.spi < plexus.core
[DEBUG]   Imported: org.eclipse.aether.transfer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.version < plexus.core
[DEBUG]   Imported: org.fusesource.jansi.* < plexus.core
[DEBUG]   Imported: org.slf4j.* < plexus.core
[DEBUG]   Imported: org.slf4j.helpers.* < plexus.core
[DEBUG]   Imported: org.slf4j.spi.* < plexus.core
[DEBUG] Populating class realm maven.api
[INFO] Error stacktraces are turned on.
[DEBUG] Message scheme: color
[DEBUG] Message styles: debug info warning error success failure strong mojo project
[DEBUG] Reading global settings from D:\develop\apache-maven-3.5.3\bin\..\conf\settings.xml
[DEBUG] Reading global toolchains from D:\develop\apache-maven-3.5.3\bin\..\conf\toolchains.xml
[DEBUG] Using local repository at D:\data\maven
[DEBUG] Using manager EnhancedLocalRepositoryManager with priority 10.0 for D:\data\maven
[INFO] Scanning for projects...
[DEBUG] Extension realms for project com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT: (none)
[DEBUG] Looking up lifecycle mappings for packaging jar from ClassRealm[plexus.core, parent: null]
[DEBUG] Resolving plugin prefix sonar from [org.apache.maven.plugins, org.codehaus.mojo]
[DEBUG] Resolved plugin prefix sonar to org.sonarsource.scanner.maven:sonar-maven-plugin from POM com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG] === REACTOR BUILD PLAN ================================================
[DEBUG] Project: com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG] Tasks:   [clean, compile]
[DEBUG] Style:   Regular
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Project: com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG] Tasks:   [sonar:sonar]
[DEBUG] Style:   Aggregating
[DEBUG] =======================================================================
[INFO] 
[INFO] ---------------< com.taobao.spring:springboot2-mybatis >----------------
[INFO] Building springboot2-mybatis 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] === PROJECT BUILD PLAN ================================================
[DEBUG] Project:       com.taobao.spring:springboot2-mybatis:1.0-SNAPSHOT
[DEBUG] Dependencies (collect): []
[DEBUG] Dependencies (resolve): [compile]
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-clean-plugin:2.5:clean (default-clean)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-resources-plugin:2.6:resources (default-resources)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
[DEBUG] =======================================================================
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=708498, ConflictMarker.markTime=328434, ConflictMarker.nodeCount=50, ConflictIdSorter.graphTime=471192, ConflictIdSorter.topsortTime=326879, ConflictIdSorter.conflictIdCount=33, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=3930018, ConflictResolver.conflictItemCount=49, DefaultDependencyCollector.collectTime=275118630, DefaultDependencyCollector.transformTime=7465665}
[DEBUG] com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG]    org.apache.commons:commons-dbcp2:jar:2.7.0:compile
[DEBUG]       org.apache.commons:commons-pool2:jar:2.7.0:compile
[DEBUG]       commons-logging:commons-logging:jar:1.2:compile
[DEBUG]    org.projectlombok:lombok:jar:1.18.8:compile
[DEBUG]    com.microsoft.sqlserver:mssql-jdbc:jar:7.4.1.jre8:compile
[DEBUG]    org.mybatis.spring.boot:mybatis-spring-boot-starter:jar:2.1.0:compile
[DEBUG]       org.springframework.boot:spring-boot-starter:jar:2.1.6.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot:jar:2.1.6.RELEASE:compile
[DEBUG]             org.springframework:spring-context:jar:5.1.8.RELEASE:compile
[DEBUG]                org.springframework:spring-aop:jar:5.1.8.RELEASE:compile
[DEBUG]                org.springframework:spring-expression:jar:5.1.8.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot-autoconfigure:jar:2.1.6.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot-starter-logging:jar:2.1.6.RELEASE:compile
[DEBUG]             ch.qos.logback:logback-classic:jar:1.2.3:compile
[DEBUG]                ch.qos.logback:logback-core:jar:1.2.3:compile
[DEBUG]             org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile
[DEBUG]                org.apache.logging.log4j:log4j-api:jar:2.11.2:compile
[DEBUG]             org.slf4j:jul-to-slf4j:jar:1.7.26:compile
[DEBUG]          javax.annotation:javax.annotation-api:jar:1.3.2:compile
[DEBUG]          org.springframework:spring-core:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-jcl:jar:5.1.8.RELEASE:compile
[DEBUG]          org.yaml:snakeyaml:jar:1.23:runtime
[DEBUG]       org.springframework.boot:spring-boot-starter-jdbc:jar:2.1.6.RELEASE:compile
[DEBUG]          com.zaxxer:HikariCP:jar:3.2.0:compile
[DEBUG]             org.slf4j:slf4j-api:jar:1.7.25:compile
[DEBUG]          org.springframework:spring-jdbc:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-beans:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-tx:jar:5.1.8.RELEASE:compile
[DEBUG]       org.mybatis.spring.boot:mybatis-spring-boot-autoconfigure:jar:2.1.0:compile
[DEBUG]       org.mybatis:mybatis:jar:3.5.2:compile
[DEBUG]       org.mybatis:mybatis-spring:jar:2.0.2:compile
[DEBUG]    junit:junit:jar:4.11:test
[DEBUG]       org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ springboot2-mybatis ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=16795, ConflictMarker.markTime=55050, ConflictMarker.nodeCount=3, ConflictIdSorter.graphTime=7465, ConflictIdSorter.topsortTime=8397, ConflictIdSorter.conflictIdCount=3, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=163596, ConflictResolver.conflictItemCount=3, DefaultDependencyCollector.collectTime=20189391, DefaultDependencyCollector.transformTime=318793}
[DEBUG] org.apache.maven.plugins:maven-clean-plugin:jar:2.5:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.6:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:3.0:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-clean-plugin:2.5
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-clean-plugin:2.5
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-clean-plugin:2.5
[DEBUG]   Included: org.apache.maven.plugins:maven-clean-plugin:jar:2.5
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:3.0
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-clean-plugin:2.5:clean from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-clean-plugin:2.5, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-clean-plugin:2.5:clean' with basic configurator -->
[DEBUG]   (f) directory = D:\github\springboot2-mybatis\target
[DEBUG]   (f) excludeDefaultDirectories = false
[DEBUG]   (f) failOnError = true
[DEBUG]   (f) followSymLinks = false
[DEBUG]   (f) outputDirectory = D:\github\springboot2-mybatis\target\classes
[DEBUG]   (f) reportDirectory = D:\github\springboot2-mybatis\target\site
[DEBUG]   (f) retryOnError = true
[DEBUG]   (f) skip = false
[DEBUG]   (f) testOutputDirectory = D:\github\springboot2-mybatis\target\test-classes
[DEBUG] -- end configuration --
[INFO] Deleting D:\github\springboot2-mybatis\target
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-8.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-7.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-6.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-5.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-4.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-3.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-2.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\syntax-highlightings-12.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-8.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-7.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-6.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-5.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-4.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-3.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-2.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\symbols-12.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-8.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-7.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-6.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-5.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-4.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-3.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\measures-2.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\issues-2.pb
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\scanner-report\analysis.log
[INFO] Deleting directory D:\github\springboot2-mybatis\target\sonar\scanner-report
[INFO] Deleting file D:\github\springboot2-mybatis\target\sonar\.sonar_lock
[INFO] Deleting directory D:\github\springboot2-mybatis\target\sonar
[INFO] Deleting file D:\github\springboot2-mybatis\target\maven-status\maven-compiler-plugin\compile\default-compile\inputFiles.lst
[INFO] Deleting file D:\github\springboot2-mybatis\target\maven-status\maven-compiler-plugin\compile\default-compile\createdFiles.lst
[INFO] Deleting directory D:\github\springboot2-mybatis\target\maven-status\maven-compiler-plugin\compile\default-compile
[INFO] Deleting directory D:\github\springboot2-mybatis\target\maven-status\maven-compiler-plugin\compile
[INFO] Deleting directory D:\github\springboot2-mybatis\target\maven-status\maven-compiler-plugin
[INFO] Deleting directory D:\github\springboot2-mybatis\target\maven-status
[INFO] Deleting directory D:\github\springboot2-mybatis\target\generated-sources\annotations
[INFO] Deleting directory D:\github\springboot2-mybatis\target\generated-sources
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\sqlserver_init.sql
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\mapper\UserMapper.xml
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\mapper
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\typehandler\UserStatusTypeHandler.class
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\typehandler\UserSexTypeHandler.class
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao\spring\typehandler
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\mapper\UserMapper.class
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao\spring\mapper
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\entity\User.class
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao\spring\entity
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\core\UserStatus.class
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\core\UserSex.class
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao\spring\core
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\com\taobao\spring\App.class
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao\spring
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com\taobao
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes\com
[INFO] Deleting file D:\github\springboot2-mybatis\target\classes\application.properties
[INFO] Deleting directory D:\github\springboot2-mybatis\target\classes
[INFO] Deleting directory D:\github\springboot2-mybatis\target
[DEBUG] Skipping non-existing directory D:\github\springboot2-mybatis\target\classes
[DEBUG] Skipping non-existing directory D:\github\springboot2-mybatis\target\test-classes
[DEBUG] Skipping non-existing directory D:\github\springboot2-mybatis\target\site
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ springboot2-mybatis ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=185055, ConflictMarker.markTime=77443, ConflictMarker.nodeCount=77, ConflictIdSorter.graphTime=111344, ConflictIdSorter.topsortTime=21460, ConflictIdSorter.conflictIdCount=26, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=706632, ConflictResolver.conflictItemCount=74, DefaultDependencyCollector.collectTime=103294204, DefaultDependencyCollector.transformTime=1133970}
[DEBUG] org.apache.maven.plugins:maven-resources-plugin:jar:2.6:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-project:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-plugin-registry:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-core:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.6:compile
[DEBUG]       org.apache.maven.reporting:maven-reporting-api:jar:2.0.6:compile
[DEBUG]          org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.0.6:compile
[DEBUG]       commons-cli:commons-cli:jar:1.0:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.0.6:compile
[DEBUG]       org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4:compile
[DEBUG]       classworlds:classworlds:jar:1.1:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-settings:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-model:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-monitor:jar:2.0.6:compile
[DEBUG]    org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile
[DEBUG]       junit:junit:jar:3.8.1:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:2.0.5:compile
[DEBUG]    org.apache.maven.shared:maven-filtering:jar:1.1:compile
[DEBUG]       org.sonatype.plexus:plexus-build-api:jar:0.0.4:compile
[DEBUG]    org.codehaus.plexus:plexus-interpolation:jar:1.13:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG]   Included: org.apache.maven.plugins:maven-resources-plugin:jar:2.6
[DEBUG]   Included: org.apache.maven.reporting:maven-reporting-api:jar:2.0.6
[DEBUG]   Included: org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7
[DEBUG]   Included: commons-cli:commons-cli:jar:1.0
[DEBUG]   Included: org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4
[DEBUG]   Included: junit:junit:jar:3.8.1
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:2.0.5
[DEBUG]   Included: org.apache.maven.shared:maven-filtering:jar:1.1
[DEBUG]   Included: org.sonatype.plexus:plexus-build-api:jar:0.0.4
[DEBUG]   Included: org.codehaus.plexus:plexus-interpolation:jar:1.13
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-resources-plugin:2.6:resources from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-resources-plugin:2.6, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-resources-plugin:2.6:resources' with basic configurator -->
[DEBUG]   (f) buildFilters = []
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) escapeWindowsPaths = true
[DEBUG]   (s) includeEmptyDirs = false
[DEBUG]   (s) outputDirectory = D:\github\springboot2-mybatis\target\classes
[DEBUG]   (s) overwrite = false
[DEBUG]   (f) project = MavenProject: com.taobao.spring:springboot2-mybatis:1.0-SNAPSHOT @ D:\github\springboot2-mybatis\pom.xml
[DEBUG]   (s) resources = [Resource {targetPath: null, filtering: false, FileSet {directory: D:\github\springboot2-mybatis\src\main\resources, PatternSet [includes: {}, excludes: {}]}}]
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@76318a7d
[DEBUG]   (f) supportMultiLineFiltering = false
[DEBUG]   (f) useBuildFilters = true
[DEBUG]   (s) useDefaultDelimiters = true
[DEBUG] -- end configuration --
[DEBUG] properties used {java.vendor=Oracle Corporation, env.SYSTEMROOT=C:\windows, env.IDEA_INITIAL_DIRECTORY=E:\ide\ideaIC-2018.2.1.win\bin, sun.java.launcher=SUN_STANDARD, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, env.PROMPT=$P$G, env.WDIR=D:\, os.name=Windows 7, env.FP_NO_HOST_CHECK=NO, sun.boot.class.path=C:\Java\Java8\jdk1.8.0_111\jre\lib\resources.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\rt.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\sunrsasign.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\jsse.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\jce.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\charsets.jar;C:\Java\Java8\jdk1.8.0_111\jre\lib\jfr.jar;C:\Java\Java8\jdk1.8.0_111\jre\classes, env.COMPUTERNAME=PC-admin, env.ALLUSERSPROFILE=C:\ProgramData, sun.desktop=windows, java.vm.specification.vendor=Oracle Corporation, java.runtime.version=1.8.0_111-b14, mssql.version=7.4.1.jre8, env.HOMEPATH=\Users\admin, project.build.sourceEncoding=UTF-8, user.name=admin, maven.build.version=Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-25T03:49:05+08:00), env.WINDOWS_TRACING_FLAGS=3, env.PATH=C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\TortoiseGit\bin;C:\Program Files\SourceGear\Common\DiffMerge\;d:\Program Files\Git\cmd;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\Client SDK\ODBC\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\ManagementStudio\;C:\cpp\MinGW\bin;C:\windows\system32\config\systemprofile\.dnx\bin;C:\Program Files\Microsoft DNX\Dnvm\;C:\Program Files\Microsoft SQL Server\120\Tools\Binn\;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\TortoiseGit\bin;C:\Program Files\SourceGear\Common\DiffMerge\;d:\Program Files\Git\cmd;C:\Program Files (x86)\Windows Kits\8.1\Windows Performance Toolkit\;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\Client SDK\ODBC\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\ManagementStudio\;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client;C:\Java\Java8\jdk1.8.0_111\bin;D:\develop\apache-maven-3.5.3\bin;C:\Ethereum\Solidity;D:\develop\gradle-4.6\bin;, user.language=zh, env.JVMCONFIG=\.mvn\jvm.config, env.WINDIR=C:\windows, sun.boot.library.path=C:\Java\Java8\jdk1.8.0_111\jre\bin, classworlds.conf=D:\develop\apache-maven-3.5.3\bin\..\bin\m2.conf, java.version=1.8.0_111, env.PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 60 Stepping 3, GenuineIntel, user.timezone=, env.TEMP=C:\Users\admin\AppData\Local\Temp, sun.arch.data.model=64, env.EXEC_DIR=D:\github\springboot2-mybatis, sonar.host.url=http://192.168.102.92:9000, env.WINDOWS_TRACING_LOGFILE=C:\BVTBin\Tests\installpackage\csilogfile.log, java.endorsed.dirs=C:\Java\Java8\jdk1.8.0_111\jre\lib\endorsed, sun.cpu.isalist=amd64, env.HOMEDRIVE=C:, sun.jnu.encoding=GBK, file.encoding.pkg=sun.io, env.SYSTEMDRIVE=C:, file.separator=\, java.specification.name=Java Platform API Specification, maven.conf=D:\develop\apache-maven-3.5.3\bin\../conf, sonar.sources=., env.JAVACMD=C:\Java\Java8\jdk1.8.0_111\bin\java.exe, java.class.version=52.0, user.country=CN, env.GRADLE_HOME=D:\develop\gradle-4.6, java.home=C:\Java\Java8\jdk1.8.0_111\jre, env.APPDATA=C:\Users\admin\AppData\Roaming, env.PUBLIC=C:\Users\Public, java.vm.info=mixed mode, env.OS=Windows_NT, os.version=6.1, maven.compiler.target=1.8, env.=::=::\, path.separator=;, java.vm.version=25.111-b14, user.variant=, env.USERPROFILE=C:\Users\admin, env.JAVA_HOME=C:\Java\Java8\jdk1.8.0_111, java.awt.printerjob=sun.awt.windows.WPrinterJob, env.TMP=C:\Users\admin\AppData\Local\Temp, env.PROGRAMFILES=C:\Program Files, sun.io.unicode.encoding=UnicodeLittle, env.GRADLE_USER_HOME=D:\data\maven, awt.toolkit=sun.awt.windows.WToolkit, user.script=, user.home=C:\Users\admin, env.LIBRARY_PATH=C:\cpp\MinGW\lib, env.COMMONPROGRAMFILES=C:\Program Files\Common Files, env.=EXITCODE=00000001, env.VS140COMNTOOLS=C:\Program Files (x86)\Microsoft Visual Studio 14.0\Common7\Tools\, env.SESSIONNAME=Console, java.specification.vendor=Oracle Corporation, env.M2_HOME=D:\develop\apache-maven-3.5.3, library.jansi.path=D:\develop\apache-maven-3.5.3\bin\..\lib\jansi-native, java.library.path=C:\Java\Java8\jdk1.8.0_111\bin;C:\windows\Sun\Java\bin;C:\windows\system32;C:\windows;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\TortoiseGit\bin;C:\Program Files\SourceGear\Common\DiffMerge\;d:\Program Files\Git\cmd;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\Client SDK\ODBC\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\ManagementStudio\;C:\cpp\MinGW\bin;C:\windows\system32\config\systemprofile\.dnx\bin;C:\Program Files\Microsoft DNX\Dnvm\;C:\Program Files\Microsoft SQL Server\120\Tools\Binn\;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\TortoiseGit\bin;C:\Program Files\SourceGear\Common\DiffMerge\;d:\Program Files\Git\cmd;C:\Program Files (x86)\Windows Kits\8.1\Windows Performance Toolkit\;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\Client SDK\ODBC\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\Binn\ManagementStudio\;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client;C:\Java\Java8\jdk1.8.0_111\bin;D:\develop\apache-maven-3.5.3\bin;C:\Ethereum\Solidity;D:\develop\gradle-4.6\bin;;., java.vendor.url=http://java.oracle.com/, env.NUMBER_OF_PROCESSORS=4, env.COMMONPROGRAMFILES(X86)=C:\Program Files (x86)\Common Files, env.USERDNSDOMAIN=taobao.COM, env.PSMODULEPATH=C:\windows\system32\WindowsPowerShell\v1.0\Modules\;C:\Program Files (x86)\Microsoft SQL Server\130\Tools\PowerShell\Modules\;C:\Program Files\WindowsPowerShell\Modules\, env.CLASSWORLDS_LAUNCHER=org.codehaus.plexus.classworlds.launcher.Launcher, env.MAVEN_CMD_LINE_ARGS=clean compile sonar:sonar -Dsonar.host.url=http://192.168.102.92:9000 -Dsonar.sourceEncoding=UTF-8 -Dsonar.sources=. -Dsonar.inclusions=src/main/** -X, java.vm.vendor=Oracle Corporation, maven.home=D:\develop\apache-maven-3.5.3\bin\.., java.runtime.name=Java(TM) SE Runtime Environment, sun.java.command=org.codehaus.plexus.classworlds.launcher.Launcher clean compile sonar:sonar -Dsonar.host.url=http://192.168.102.92:9000 -Dsonar.sourceEncoding=UTF-8 -Dsonar.sources=. -Dsonar.inclusions=src/main/** -X, java.class.path=D:\develop\apache-maven-3.5.3\bin\..\boot\plexus-classworlds-2.5.2.jar, env.PROGRAMW6432=C:\Program Files, maven.version=3.5.3, env.PROGRAMFILES(X86)=C:\Program Files (x86), java.vm.specification.name=Java Virtual Machine Specification, env.LOGONSERVER=\\WIN-AD-AUX, java.vm.specification.version=1.8, env.PROCESSOR_ARCHITECTURE=AMD64, sonar.sourceEncoding=UTF-8, env.COMMONPROGRAMW6432=C:\Program Files\Common Files, sun.cpu.endian=little, sun.os.patch.level=Service Pack 1, env.ANT_HOME=D:\develop\apache-ant-1.9.6, java.io.tmpdir=C:\Users\admin\AppData\Local\Temp\, env.PROCESSOR_REVISION=3c03, env.VS120COMNTOOLS=C:\Program Files (x86)\Microsoft Visual Studio 12.0\Common7\Tools\, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, maven.multiModuleProjectDirectory=D:\github\springboot2-mybatis, env.PROGRAMDATA=C:\ProgramData, env.COMSPEC=C:\windows\system32\cmd.exe, maven.compiler.source=1.8, env.__INTELLIJ_COMMAND_HISTFILE__=C:\Users\admin\.IdeaIC2019.2\config\terminal\history\history-711, os.arch=amd64, java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment, java.ext.dirs=C:\Java\Java8\jdk1.8.0_111\jre\lib\ext;C:\windows\Sun\Java\lib\ext, env.=D:=D:\github\springboot2-mybatis, user.dir=D:\github\springboot2-mybatis, env.MAVEN_HOME=D:\develop\apache-maven-3.5.3\bin\.., env.LOCALAPPDATA=C:\Users\admin\AppData\Local, line.separator=
, env.MINGW_HOME=C:\cpp\MinGW, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, env.CLASSWORLDS_JAR="D:\develop\apache-maven-3.5.3\bin\..\boot\plexus-classworlds-2.5.2.jar", env.DEVMGR_SHOW_DETAILS=1, sonar.maven.plugin.version=3.5.0.1254, env.PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, env.ERROR_CODE=0, env.TERMINAL_EMULATOR=JetBrains-JediTerm, env.USERNAME=admin, sun.stderr.encoding=ms936, file.encoding=GBK, env.TRADE_CONFIG_FILE=d:/tmp/a.properties, env.USERDOMAIN=taobao, java.specification.version=1.8, env.C_INCLUDEDE_PATH=C:\cpp\MinGW\include, sonar.inclusions=src/main/**, env.PROCESSOR_LEVEL=6, env.MAVEN_PROJECTBASEDIR=D:\github\springboot2-mybatis}
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[DEBUG] resource with targetPath null
directory D:\github\springboot2-mybatis\src\main\resources
excludes []
includes []
[DEBUG] ignoreDelta true
[INFO] Copying 3 resources
[DEBUG] file application.properties has a filtered file extension
[DEBUG] copy D:\github\springboot2-mybatis\src\main\resources\application.properties to D:\github\springboot2-mybatis\target\classes\application.properties
[DEBUG] file UserMapper.xml has a filtered file extension
[DEBUG] copy D:\github\springboot2-mybatis\src\main\resources\mapper\UserMapper.xml to D:\github\springboot2-mybatis\target\classes\mapper\UserMapper.xml
[DEBUG] file sqlserver_init.sql has a filtered file extension
[DEBUG] copy D:\github\springboot2-mybatis\src\main\resources\sqlserver_init.sql to D:\github\springboot2-mybatis\target\classes\sqlserver_init.sql
[DEBUG] no use filter components
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ springboot2-mybatis ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=350206, ConflictMarker.markTime=173859, ConflictMarker.nodeCount=160, ConflictIdSorter.graphTime=126584, ConflictIdSorter.topsortTime=45720, ConflictIdSorter.conflictIdCount=43, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=795894, ConflictResolver.conflictItemCount=63, DefaultDependencyCollector.collectTime=211402027, DefaultDependencyCollector.transformTime=1509679}
[DEBUG] org.apache.maven.plugins:maven-compiler-plugin:jar:3.1:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.9:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.9:compile
[DEBUG]       org.codehaus.plexus:plexus-utils:jar:1.5.1:compile
[DEBUG]    org.apache.maven:maven-core:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-settings:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-model:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-project:jar:2.0.9:compile
[DEBUG]          org.apache.maven:maven-plugin-registry:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-monitor:jar:2.0.9:compile
[DEBUG]    org.apache.maven:maven-toolchain:jar:1.0:compile
[DEBUG]    org.apache.maven.shared:maven-shared-utils:jar:0.1:compile
[DEBUG]       com.google.code.findbugs:jsr305:jar:2.0.1:compile
[DEBUG]    org.apache.maven.shared:maven-shared-incremental:jar:1.1:compile
[DEBUG]       org.codehaus.plexus:plexus-component-annotations:jar:1.5.5:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-api:jar:2.2:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-manager:jar:2.2:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-javac:jar:2.2:runtime
[DEBUG]    org.codehaus.plexus:plexus-container-default:jar:1.5.5:compile
[DEBUG]       org.codehaus.plexus:plexus-classworlds:jar:2.2.2:compile
[DEBUG]       org.apache.xbean:xbean-reflect:jar:3.4:compile
[DEBUG]          log4j:log4j:jar:1.2.12:compile
[DEBUG]          commons-logging:commons-logging-api:jar:1.1:compile
[DEBUG]       com.google.collections:google-collections:jar:1.0:compile
[DEBUG]       junit:junit:jar:3.8.2:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG]   Included: org.apache.maven.plugins:maven-compiler-plugin:jar:3.1
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:1.5.1
[DEBUG]   Included: org.apache.maven.shared:maven-shared-utils:jar:0.1
[DEBUG]   Included: com.google.code.findbugs:jsr305:jar:2.0.1
[DEBUG]   Included: org.apache.maven.shared:maven-shared-incremental:jar:1.1
[DEBUG]   Included: org.codehaus.plexus:plexus-component-annotations:jar:1.5.5
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-api:jar:2.2
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-manager:jar:2.2
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-javac:jar:2.2
[DEBUG]   Included: org.apache.xbean:xbean-reflect:jar:3.4
[DEBUG]   Included: log4j:log4j:jar:1.2.12
[DEBUG]   Included: commons-logging:commons-logging-api:jar:1.1
[DEBUG]   Included: com.google.collections:google-collections:jar:1.0
[DEBUG]   Included: junit:junit:jar:3.8.2
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-compiler-plugin:3.1:compile from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-compiler-plugin:3.1:compile' with basic configurator -->
[DEBUG]   (f) basedir = D:\github\springboot2-mybatis
[DEBUG]   (f) buildDirectory = D:\github\springboot2-mybatis\target
[DEBUG]   (f) classpathElements = [D:\github\springboot2-mybatis\target\classes, D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar, D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar, D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar, D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar, D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar, D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar, D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar, D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar, D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar, D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar, D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar, D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar, D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar, D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar, D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar, D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar, D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar, D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar, D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar, D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar, D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar, D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar, D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar, D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar]
[DEBUG]   (f) compileSourceRoots = [D:\github\springboot2-mybatis\src\main\java]
[DEBUG]   (f) compilerId = javac
[DEBUG]   (f) debug = true
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) failOnError = true
[DEBUG]   (f) forceJavacCompilerUse = false
[DEBUG]   (f) fork = false
[DEBUG]   (f) generatedSourcesDirectory = D:\github\springboot2-mybatis\target\generated-sources\annotations
[DEBUG]   (f) mojoExecution = org.apache.maven.plugins:maven-compiler-plugin:3.1:compile {execution: default-compile}
[DEBUG]   (f) optimize = false
[DEBUG]   (f) outputDirectory = D:\github\springboot2-mybatis\target\classes
[DEBUG]   (f) projectArtifact = com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG]   (f) showDeprecation = false
[DEBUG]   (f) showWarnings = false
[DEBUG]   (f) skipMultiThreadWarning = false
[DEBUG]   (f) source = 1.8
[DEBUG]   (f) staleMillis = 0
[DEBUG]   (f) target = 1.8
[DEBUG]   (f) useIncrementalCompilation = true
[DEBUG]   (f) verbose = false
[DEBUG]   (f) mavenSession = org.apache.maven.execution.MavenSession@76318a7d
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@76318a7d
[DEBUG] -- end configuration --
[DEBUG] Using compiler 'javac'.
[DEBUG] Source directories: [D:\github\springboot2-mybatis\src\main\java]
[DEBUG] Classpath: [D:\github\springboot2-mybatis\target\classes
 D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar
 D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar
 D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar
 D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar
 D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar
 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar
 D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar
 D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar
 D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar
 D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar
 D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar
 D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar
 D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar
 D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar
 D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar
 D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar
 D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar
 D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar
 D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar
 D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar
 D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar
 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar
 D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar
 D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar]
[DEBUG] Output directory: D:\github\springboot2-mybatis\target\classes
[DEBUG] CompilerReuseStrategy: reuseCreated
[DEBUG] useIncrementalCompilation enabled
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\typehandler\UserSexTypeHandler.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\mapper\UserMapper.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\core\UserStatus.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\typehandler\UserStatusTypeHandler.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\App.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\entity\User.java
[DEBUG] Stale source detected: D:\github\springboot2-mybatis\src\main\java\com\taobao\spring\core\UserSex.java
[INFO] Changes detected - recompiling the module!
[DEBUG] Classpath:
[DEBUG]  D:\github\springboot2-mybatis\target\classes
[DEBUG]  D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar
[DEBUG]  D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar
[DEBUG]  D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar
[DEBUG]  D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar
[DEBUG]  D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar
[DEBUG]  D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar
[DEBUG]  D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar
[DEBUG]  D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar
[DEBUG]  D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar
[DEBUG]  D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar
[DEBUG]  D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar
[DEBUG]  D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar
[DEBUG]  D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar
[DEBUG]  D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar
[DEBUG]  D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar
[DEBUG]  D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar
[DEBUG]  D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar
[DEBUG]  D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar
[DEBUG]  D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar
[DEBUG]  D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar
[DEBUG] Source roots:
[DEBUG]  D:\github\springboot2-mybatis\src\main\java
[DEBUG] Command line options:
[DEBUG] -d D:\github\springboot2-mybatis\target\classes -classpath D:\github\springboot2-mybatis\target\classes;D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar;D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar;D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar;D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar;D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar;D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar;D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar;D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar;D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar;D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar;D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar; -sourcepath D:\github\springboot2-mybatis\src\main\java; -s D:\github\springboot2-mybatis\target\generated-sources\annotations -g -nowarn -target 1.8 -source 1.8 -encoding UTF-8
[DEBUG] -d D:\github\springboot2-mybatis\target\classes -classpath D:\github\springboot2-mybatis\target\classes;D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar;D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar;D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar;D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar;D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar;D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar;D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar;D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar;D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar;D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar;D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar; -sourcepath D:\github\springboot2-mybatis\src\main\java; -s D:\github\springboot2-mybatis\target\generated-sources\annotations -g -nowarn -target 1.8 -source 1.8 -encoding UTF-8
[DEBUG] -d D:\github\springboot2-mybatis\target\classes -classpath D:\github\springboot2-mybatis\target\classes;D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar;D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar;D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar;D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar;D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar;D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar;D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar;D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar;D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar;D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar;D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar; -sourcepath D:\github\springboot2-mybatis\src\main\java; -s D:\github\springboot2-mybatis\target\generated-sources\annotations -g -nowarn -target 1.8 -source 1.8 -encoding UTF-8
[DEBUG] -d D:\github\springboot2-mybatis\target\classes -classpath D:\github\springboot2-mybatis\target\classes;D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar;D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar;D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar;D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar;D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar;D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar;D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar;D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar;D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar;D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar;D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar;D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar;D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar;D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar;D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar; -sourcepath D:\github\springboot2-mybatis\src\main\java; -s D:\github\springboot2-mybatis\target\generated-sources\annotations -g -nowarn -target 1.8 -source 1.8 -encoding UTF-8
[DEBUG] incrementalBuildHelper#beforeRebuildExecution
[INFO] Compiling 7 source files to D:\github\springboot2-mybatis\target\classes
[DEBUG] incrementalBuildHelper#afterRebuildExecution
[INFO] 
[INFO] ---------------< com.taobao.spring:springboot2-mybatis >----------------
[INFO] Building springboot2-mybatis 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[DEBUG] Resolving plugin prefix sonar from [org.apache.maven.plugins, org.codehaus.mojo]
[DEBUG] Resolved plugin prefix sonar to org.sonarsource.scanner.maven:sonar-maven-plugin from POM com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] === PROJECT BUILD PLAN ================================================
[DEBUG] Project:       com.taobao.spring:springboot2-mybatis:1.0-SNAPSHOT
[DEBUG] Dependencies (collect): []
[DEBUG] Dependencies (resolve): [test]
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar (default-cli)
[DEBUG] Style:         Aggregating
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <mojoExecution default-value="${mojoExecution}"/>
  <session default-value="${session}"/>
  <skip default-value="false">${sonar.skip}</skip>
</configuration>
[DEBUG] =======================================================================
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=166084, ConflictMarker.markTime=33901, ConflictMarker.nodeCount=50, ConflictIdSorter.graphTime=70912, ConflictIdSorter.topsortTime=31102, ConflictIdSorter.conflictIdCount=33, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=738044, ConflictResolver.conflictItemCount=49, DefaultDependencyCollector.collectTime=2661688, DefaultDependencyCollector.transformTime=1053416}
[DEBUG] com.taobao.spring:springboot2-mybatis:jar:1.0-SNAPSHOT
[DEBUG]    org.apache.commons:commons-dbcp2:jar:2.7.0:compile
[DEBUG]       org.apache.commons:commons-pool2:jar:2.7.0:compile
[DEBUG]       commons-logging:commons-logging:jar:1.2:compile
[DEBUG]    org.projectlombok:lombok:jar:1.18.8:compile
[DEBUG]    com.microsoft.sqlserver:mssql-jdbc:jar:7.4.1.jre8:compile
[DEBUG]    org.mybatis.spring.boot:mybatis-spring-boot-starter:jar:2.1.0:compile
[DEBUG]       org.springframework.boot:spring-boot-starter:jar:2.1.6.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot:jar:2.1.6.RELEASE:compile
[DEBUG]             org.springframework:spring-context:jar:5.1.8.RELEASE:compile
[DEBUG]                org.springframework:spring-aop:jar:5.1.8.RELEASE:compile
[DEBUG]                org.springframework:spring-expression:jar:5.1.8.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot-autoconfigure:jar:2.1.6.RELEASE:compile
[DEBUG]          org.springframework.boot:spring-boot-starter-logging:jar:2.1.6.RELEASE:compile
[DEBUG]             ch.qos.logback:logback-classic:jar:1.2.3:compile
[DEBUG]                ch.qos.logback:logback-core:jar:1.2.3:compile
[DEBUG]             org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile
[DEBUG]                org.apache.logging.log4j:log4j-api:jar:2.11.2:compile
[DEBUG]             org.slf4j:jul-to-slf4j:jar:1.7.26:compile
[DEBUG]          javax.annotation:javax.annotation-api:jar:1.3.2:compile
[DEBUG]          org.springframework:spring-core:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-jcl:jar:5.1.8.RELEASE:compile
[DEBUG]          org.yaml:snakeyaml:jar:1.23:runtime
[DEBUG]       org.springframework.boot:spring-boot-starter-jdbc:jar:2.1.6.RELEASE:compile
[DEBUG]          com.zaxxer:HikariCP:jar:3.2.0:compile
[DEBUG]             org.slf4j:slf4j-api:jar:1.7.25:compile
[DEBUG]          org.springframework:spring-jdbc:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-beans:jar:5.1.8.RELEASE:compile
[DEBUG]             org.springframework:spring-tx:jar:5.1.8.RELEASE:compile
[DEBUG]       org.mybatis.spring.boot:mybatis-spring-boot-autoconfigure:jar:2.1.0:compile
[DEBUG]       org.mybatis:mybatis:jar:3.5.2:compile
[DEBUG]       org.mybatis:mybatis-spring:jar:2.0.2:compile
[DEBUG]    junit:junit:jar:4.11:test
[DEBUG]       org.hamcrest:hamcrest-core:jar:1.3:test
[INFO] 
[INFO] --- sonar-maven-plugin:3.5.0.1254:sonar (default-cli) @ springboot2-mybatis ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=102013, ConflictMarker.markTime=16484, ConflictMarker.nodeCount=7, ConflictIdSorter.graphTime=68735, ConflictIdSorter.topsortTime=10264, ConflictIdSorter.conflictIdCount=6, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=552056, ConflictResolver.conflictItemCount=7, DefaultDependencyCollector.collectTime=19202843, DefaultDependencyCollector.transformTime=776922}
[DEBUG] org.sonarsource.scanner.maven:sonar-maven-plugin:jar:3.5.0.1254:
[DEBUG]    org.sonatype.plexus:plexus-sec-dispatcher:jar:1.4:compile
[DEBUG]       org.sonatype.plexus:plexus-cipher:jar:1.4:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:3.0.22:compile
[DEBUG]    org.sonarsource.scanner.api:sonar-scanner-api:jar:2.10.0.1189:compile
[DEBUG]    commons-lang:commons-lang:jar:2.6:compile
[DEBUG] Created new class realm plugin>org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254
[DEBUG] Importing foreign packages into class realm plugin>org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254
[DEBUG]   Included: org.sonarsource.scanner.maven:sonar-maven-plugin:jar:3.5.0.1254
[DEBUG]   Included: org.sonatype.plexus:plexus-sec-dispatcher:jar:1.4
[DEBUG]   Included: org.sonatype.plexus:plexus-cipher:jar:1.4
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:3.0.22
[DEBUG]   Included: org.sonarsource.scanner.api:sonar-scanner-api:jar:2.10.0.1189
[DEBUG]   Included: commons-lang:commons-lang:jar:2.6
[DEBUG] Configuring mojo org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar from plugin realm ClassRealm[plugin>org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar' with basic configurator -->
[DEBUG]   (f) mojoExecution = org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar {execution: default-cli}
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@76318a7d
[DEBUG]   (f) skip = false
[DEBUG] -- end configuration --
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] 09:49:26.610 keyStore is : 
[DEBUG] 09:49:26.612 keyStore type is : jks
[DEBUG] 09:49:26.612 keyStore provider is : 
[DEBUG] 09:49:26.612 init keystore
[DEBUG] 09:49:26.613 init keymanager of type SunX509
[DEBUG] 09:49:26.731 Extract sonar-scanner-api-batch in temp...
[DEBUG] 09:49:26.736 Get bootstrap index...
[DEBUG] 09:49:26.737 Download: http://192.168.102.92:9000/batch/index
[DEBUG] 09:49:26.775 Get bootstrap completed
[DEBUG] 09:49:26.782 Create isolated classloader...
[DEBUG] 09:49:26.786 Start temp cleaning...
[DEBUG] 09:49:26.795 Temp cleaning done
[DEBUG] 09:49:26.795 Execution getVersion
[INFO] 09:49:26.798 SonarQube version: 7.9.1
[INFO] 09:49:26.816 Default locale: "zh_CN", source code encoding: "UTF-8"
[DEBUG] 09:49:26.816 Work directory: D:\github\springboot2-mybatis\target\sonar
[DEBUG] 09:49:26.818 Execution execute
[WARNING] 09:49:27.166 SonarScanner will require Java 11+ to run starting in SonarQube 8.x
[DEBUG] 09:49:27.167 Community 7.9.1.27448
[INFO] 09:49:27.322 Load global settings
[DEBUG] 09:49:27.365 GET 200 http://192.168.102.92:9000/api/settings/values.protobuf | time=41ms
[INFO] 09:49:27.515 Load global settings (done) | time=192ms
[INFO] 09:49:27.518 Server id: 51804F84-AWzWHrE8Q32PhGqiKic2
[INFO] 09:49:27.534 Load/download plugins
[INFO] 09:49:27.535 Load plugins index
[DEBUG] 09:49:27.541 GET 200 http://192.168.102.92:9000/api/plugins/installed | time=6ms
[INFO] 09:49:27.576 Load plugins index (done) | time=41ms
[INFO] 09:49:27.606 Load/download plugins (done) | time=72ms
[DEBUG] 09:49:27.688 Plugins:
[DEBUG] 09:49:27.688   * SonarPython 1.14.1.3143 (python)
[DEBUG] 09:49:27.689   * SonarCSS 1.1.1.1010 (cssfamily)
[DEBUG] 09:49:27.689   * GitHub Authentication for SonarQube 1.5.0.870 (authgithub)
[DEBUG] 09:49:27.690   * MyBatis Plugin for SonarQube 1.0.4 (mybatis)
[DEBUG] 09:49:27.690   * JaCoCo 1.0.2.475 (jacoco)
[DEBUG] 09:49:27.691   * SonarGo 1.1.1.2000 (go)
[DEBUG] 09:49:27.691   * SonarKotlin 1.5.0.315 (kotlin)
[DEBUG] 09:49:27.691   * Svn 1.9.0.1295 (scmsvn)
[DEBUG] 09:49:27.691   * SonarJS 5.2.1.7778 (javascript)
[DEBUG] 09:49:27.692   * SonarRuby 1.5.0.315 (ruby)
[DEBUG] 09:49:27.692   * SonarScala 1.5.0.315 (sonarscala)
[DEBUG] 09:49:27.693   * SonarC# 7.15.0.8572 (csharp)
[DEBUG] 09:49:27.693   * SonarJava 5.13.1.18282 (java)
[DEBUG] 09:49:27.694   * LDAP 2.2.0.608 (ldap)
[DEBUG] 09:49:27.694   * SonarHTML 3.1.0.1615 (web)
[DEBUG] 09:49:27.694   * Git 1.8.0.1574 (scmgit)
[DEBUG] 09:49:27.695   * SonarFlex 2.5.1.1831 (flex)
[DEBUG] 09:49:27.695   * SonarXML 2.0.1.2020 (xml)
[DEBUG] 09:49:27.695   * SAML 2.0 Authentication for SonarQube 1.1.0.181 (authsaml)
[DEBUG] 09:49:27.696   * SonarPHP 3.2.0.4868 (php)
[DEBUG] 09:49:27.696   * SonarTS 1.9.0.3766 (typescript)
[DEBUG] 09:49:27.697   * SonarVB 7.15.0.8572 (vbnet)
[INFO] 09:49:28.109 Process project properties
[DEBUG] 09:49:28.116 Process project properties (done) | time=7ms
[INFO] 09:49:28.116 Execute project builders
[DEBUG] 09:49:28.117 Execute project builder: org.sonar.plugins.csharp.CSharpGlobalProtobufFileProcessor
[DEBUG] 09:49:28.123 Execute project builder: org.sonar.plugins.vbnet.VbNetGlobalProtobufFileProcessor
[INFO] 09:49:28.127 Execute project builders (done) | time=11ms
[INFO] 09:49:28.133 Project key: com.taobao.spring:springboot2-mybatis
[INFO] 09:49:28.133 Base dir: D:\github\springboot2-mybatis
[INFO] 09:49:28.134 Working dir: D:\github\springboot2-mybatis\target\sonar
[DEBUG] 09:49:28.134 Project global encoding: UTF-8, default locale: zh_CN
[DEBUG] 09:49:28.136 Creating module hierarchy
[DEBUG] 09:49:28.137   Init module 'springboot2-mybatis'
[DEBUG] 09:49:28.140     Base dir: D:\github\springboot2-mybatis
[DEBUG] 09:49:28.141     Working dir: D:\github\springboot2-mybatis\target\sonar
[DEBUG] 09:49:28.141     Module global encoding: UTF-8, default locale: zh_CN
[INFO] 09:49:28.153 Load project settings for component key: 'com.taobao.spring:springboot2-mybatis'
[DEBUG] 09:49:28.167 GET 200 http://192.168.102.92:9000/api/settings/values.protobuf?component=com.taobao.spring%3Aspringboot2-mybatis | time=14ms
[INFO] 09:49:28.169 Load project settings for component key: 'com.taobao.spring:springboot2-mybatis' (done) | time=16ms
[DEBUG] 09:49:28.191 Available languages:
[DEBUG] 09:49:28.191   * Python => "py"
[DEBUG] 09:49:28.191   * CSS => "css"
[DEBUG] 09:49:28.191   * Go => "go"
[DEBUG] 09:49:28.191   * Kotlin => "kotlin"
[DEBUG] 09:49:28.192   * JavaScript => "js"
[DEBUG] 09:49:28.192   * Ruby => "ruby"
[DEBUG] 09:49:28.192   * Scala => "scala"
[DEBUG] 09:49:28.192   * C# => "cs"
[DEBUG] 09:49:28.192   * Java => "java"
[DEBUG] 09:49:28.192   * HTML => "web"
[DEBUG] 09:49:28.192   * JSP => "jsp"
[DEBUG] 09:49:28.192   * Flex => "flex"
[DEBUG] 09:49:28.192   * XML => "xml"
[DEBUG] 09:49:28.193   * PHP => "php"
[DEBUG] 09:49:28.193   * TypeScript => "ts"
[DEBUG] 09:49:28.193   * VB.NET => "vbnet"
[INFO] 09:49:28.197 Load quality profiles
[DEBUG] 09:49:28.220 GET 200 http://192.168.102.92:9000/api/qualityprofiles/search.protobuf?projectKey=com.taobao.spring%3Aspringboot2-mybatis | time=21ms
[INFO] 09:49:28.236 Load quality profiles (done) | time=39ms
[INFO] 09:49:28.244 Load active rules
[DEBUG] 09:49:28.257 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHv5TQ32PhGqiKj1T&ps=500&p=1 | time=12ms
[DEBUG] 09:49:28.341 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHv7PQ32PhGqiKj2J&ps=500&p=1 | time=13ms
[DEBUG] 09:49:28.350 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHv8OQ32PhGqiKj2o&ps=500&p=1 | time=5ms
[DEBUG] 09:49:28.363 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHv-MQ32PhGqiKj4H&ps=500&p=1 | time=12ms
[DEBUG] 09:49:28.379 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHv8qQ32PhGqiKj3J&ps=500&p=1 | time=13ms
[DEBUG] 09:49:28.406 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwCvQ32PhGqiKj-n&ps=500&p=1 | time=23ms
[DEBUG] 09:49:28.433 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwEUQ32PhGqiKkA3&ps=500&p=1 | time=17ms
[DEBUG] 09:49:28.450 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwFmQ32PhGqiKkCA&ps=500&p=1 | time=12ms
[DEBUG] 09:49:28.495 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwHmQ32PhGqiKkGJ&ps=500&p=1 | time=42ms
[DEBUG] 09:49:28.615 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwLrQ32PhGqiKkPx&ps=500&p=1 | time=107ms
[DEBUG] 09:49:28.640 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwPGQ32PhGqiKkWC&ps=500&p=1 | time=11ms
[DEBUG] 09:49:28.657 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwRQQ32PhGqiKkXQ&ps=500&p=1 | time=16ms
[DEBUG] 09:49:28.669 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzXdrJ80Ef4W2p7FC10&ps=500&p=1 | time=10ms
[DEBUG] 09:49:28.698 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwToQ32PhGqiKkZt&ps=500&p=1 | time=27ms
[DEBUG] 09:49:28.729 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwX-Q32PhGqiKkeN&ps=500&p=1 | time=27ms
[DEBUG] 09:49:28.748 GET 200 http://192.168.102.92:9000/api/rules/search.protobuf?f=repo,name,severity,lang,internalKey,templateKey,params,actives,createdAt,updatedAt&activation=true&qprofile=AWzWHwZYQ32PhGqiKkgo&ps=500&p=1 | time=15ms
[INFO] 09:49:28.758 Load active rules (done) | time=514ms
[WARNING] 09:49:28.784 SCM provider autodetection failed. Please use "sonar.scm.provider" to define SCM of your project, or disable the SCM Sensor in the project settings.
[DEBUG] 09:49:28.820 Declared extensions of language Python were converted to sonar.lang.patterns.py : **/*.py
[DEBUG] 09:49:28.820 Declared extensions of language CSS were converted to sonar.lang.patterns.css : **/*.css,**/*.less,**/*.scss
[DEBUG] 09:49:28.821 Declared extensions of language Go were converted to sonar.lang.patterns.go : **/*.go
[DEBUG] 09:49:28.821 Declared extensions of language Kotlin were converted to sonar.lang.patterns.kotlin : **/*.kt
[DEBUG] 09:49:28.821 Declared extensions of language JavaScript were converted to sonar.lang.patterns.js : **/*.js,**/*.jsx,**/*.vue
[DEBUG] 09:49:28.822 Declared extensions of language Ruby were converted to sonar.lang.patterns.ruby : **/*.rb
[DEBUG] 09:49:28.822 Declared extensions of language Scala were converted to sonar.lang.patterns.scala : **/*.scala
[DEBUG] 09:49:28.822 Declared extensions of language C# were converted to sonar.lang.patterns.cs : **/*.cs
[DEBUG] 09:49:28.822 Declared extensions of language Java were converted to sonar.lang.patterns.java : **/*.java,**/*.jav
[DEBUG] 09:49:28.823 Declared extensions of language HTML were converted to sonar.lang.patterns.web : **/*.html,**/*.xhtml,**/*.cshtml,**/*.vbhtml,**/*.aspx,**/*.ascx,**/*.rhtml,**/*.erb,**/*.shtm,**/*.shtml
[DEBUG] 09:49:28.823 Declared extensions of language JSP were converted to sonar.lang.patterns.jsp : **/*.jsp,**/*.jspf,**/*.jspx
[DEBUG] 09:49:28.824 Declared extensions of language Flex were converted to sonar.lang.patterns.flex : **/*.as
[DEBUG] 09:49:28.825 Declared extensions of language XML were converted to sonar.lang.patterns.xml : **/*.xml,**/*.xsd,**/*.xsl
[DEBUG] 09:49:28.826 Declared extensions of language PHP were converted to sonar.lang.patterns.php : **/*.php,**/*.php3,**/*.php4,**/*.php5,**/*.phtml,**/*.inc
[DEBUG] 09:49:28.827 Declared extensions of language TypeScript were converted to sonar.lang.patterns.ts : **/*.ts,**/*.tsx
[DEBUG] 09:49:28.828 Declared extensions of language VB.NET were converted to sonar.lang.patterns.vbnet : **/*.vb
[DEBUG] 09:49:28.830 Will ignore generated code
[DEBUG] 09:49:28.832 Will ignore generated code
[INFO] 09:49:28.833 Indexing files...
[INFO] 09:49:28.833 Project configuration:
[INFO] 09:49:28.834   Included sources: src/main/**
[DEBUG] 09:49:28.865 'src\main\java\com\taobao\spring\App.java' indexed with language 'java'
[DEBUG] 09:49:28.867 'src\main\java\com\taobao\spring\core\UserSex.java' indexed with language 'java'
[DEBUG] 09:49:28.869 'src\main\java\com\taobao\spring\core\UserStatus.java' indexed with language 'java'
[DEBUG] 09:49:28.871 'src\main\java\com\taobao\spring\entity\User.java' indexed with language 'java'
[DEBUG] 09:49:28.873 'src\main\java\com\taobao\spring\mapper\UserMapper.java' indexed with language 'java'
[DEBUG] 09:49:28.875 'src\main\java\com\taobao\spring\typehandler\UserSexTypeHandler.java' indexed with language 'java'
[DEBUG] 09:49:28.877 'src\main\java\com\taobao\spring\typehandler\UserStatusTypeHandler.java' indexed with language 'java'
[DEBUG] 09:49:28.878 'src\main\resources\application.properties' indexed with language 'null'
[DEBUG] 09:49:28.880 'src\main\resources\mapper\UserMapper.xml' indexed with language 'xml'
[DEBUG] 09:49:28.881 'src\main\resources\sqlserver_init.sql' indexed with language 'null'
[DEBUG] 09:49:28.907 'src\test\java\com\taobao\spring\AppTest.java' indexed as test with language 'java'
[INFO] 09:49:28.908 11 files indexed
[INFO] 09:49:28.908 0 files ignored because of inclusion/exclusion patterns
[INFO] 09:49:28.909 Quality profile for java: Sonar way
[INFO] 09:49:28.909 Quality profile for xml: MyBatisLint Rules
[INFO] 09:49:28.909 ------------- Run sensors on module springboot2-mybatis
[INFO] 09:49:29.050 Load metrics repository
[DEBUG] 09:49:29.058 GET 200 http://192.168.102.92:9000/api/metrics/search?f=name,description,direction,qualitative,custom&ps=500&p=1 | time=8ms
[INFO] 09:49:29.067 Load metrics repository (done) | time=17ms
[DEBUG] 09:49:30.180 'Import external issues report' skipped because one of the required properties is missing
[DEBUG] 09:49:30.180 'Python Squid Sensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.181 'Cobertura Sensor for Python coverage' skipped because there is no related file in current project
[DEBUG] 09:49:30.181 'PythonXUnitSensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.181 'PylintSensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.182 'PylintImportSensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.183 'Import of Bandit issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.183 'SonarCSS Metrics' skipped because there is no related file in current project
[DEBUG] 09:49:30.183 'SonarCSS Rules' skipped because there is no related file in current project
[DEBUG] 09:49:30.184 'Import of stylelint issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.184 'SonarGo' skipped because there is no related file in current project
[DEBUG] 09:49:30.185 'Go Unit Test Report' skipped because there is no related file in current project
[DEBUG] 09:49:30.186 'Import of go vet issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.186 'Import of Golint issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.186 'Import of GoMetaLinter issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.186 'Kotlin Sensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.187 'Import of detekt issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.188 'Import of Android Lint issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.188 'SonarJS' skipped because there is no related file in current project
[DEBUG] 09:49:30.189 'ESLint-based SonarJS' skipped because there is no related file in current project
[DEBUG] 09:49:30.190 'SonarJS Coverage' skipped because there is no related file in current project
[DEBUG] 09:49:30.190 'Import of ESLint issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.191 'Ruby Sensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.191 'Import of RuboCop issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.192 'SimpleCov Sensor for Ruby coverage' skipped because there is no related file in current project
[DEBUG] 09:49:30.192 'Scala Sensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.193 'Scoverage sensor for Scala coverage' skipped because one of the required properties is missing
[DEBUG] 09:49:30.193 'Import of Scalastyle issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.194 'Import of Scapegoat issues' skipped because there is no related file in current project
[DEBUG] 09:49:30.194 'C# Properties' skipped because there is no related file in current project
[DEBUG] 09:49:30.196 'Import of Checkstyle issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.196 'Import of PMD issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.197 'Import of SpotBugs issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.198 'Flex' skipped because there is no related file in current project
[DEBUG] 09:49:30.199 'Flex Cobertura' skipped because there is no related file in current project
[DEBUG] 09:49:30.199 'PHP sensor' skipped because there is no related file in current project
[DEBUG] 09:49:30.199 'Analyzer for "php.ini" files' skipped because there is no related file in current project
[DEBUG] 09:49:30.200 'SonarTS' skipped because there is no related file in current project
[DEBUG] 09:49:30.200 'SonarTS Coverage' skipped because there is no related file in current project
[DEBUG] 09:49:30.201 'Import of TSLint issues' skipped because one of the required properties is missing
[DEBUG] 09:49:30.201 'VB.NET Properties' skipped because there is no related file in current project
[DEBUG] 09:49:30.205 'Generic Coverage Report' skipped because one of the required properties is missing
[DEBUG] 09:49:30.205 'Generic Test Executions Report' skipped because one of the required properties is missing
[DEBUG] 09:49:30.205 'C#' skipped because there is no related file in current project
[DEBUG] 09:49:30.206 'C# Tests Coverage Report Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.206 '[Deprecated] C# Integration Tests Coverage Report Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.206 'C# Unit Test Results Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.207 'VB.NET' skipped because there is no related file in current project
[DEBUG] 09:49:30.207 'VB.NET Tests Coverage Report Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.207 '[Deprecated] VB.NET Integration Tests Coverage Report Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.207 'VB.NET Unit Test Results Import' skipped because there is no related file in current project
[DEBUG] 09:49:30.208 Sensors : JavaSquidSensor -> MyBatisLint Sensor -> JaCoCo XML Report Importer -> SurefireSensor -> JaCoCoSensor -> JavaXmlSensor -> HTML -> XML Sensor
[INFO] 09:49:30.209 Sensor JavaSquidSensor [java]
[INFO] 09:49:30.638 Configured Java source version (sonar.java.source): 8
[INFO] 09:49:30.647 JavaClasspath initialization
[INFO] 09:49:30.659 JavaClasspath initialization (done) | time=12ms
[INFO] 09:49:30.659 JavaTestClasspath initialization
[INFO] 09:49:30.661 JavaTestClasspath initialization (done) | time=2ms
[DEBUG] 09:49:30.879 ----- Classpath analyzed by Squid:
[DEBUG] 09:49:30.879 D:\github\springboot2-mybatis\target\classes
[DEBUG] 09:49:30.879 D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar
[DEBUG] 09:49:30.879 D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar
[DEBUG] 09:49:30.879 D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar
[DEBUG] 09:49:30.880 D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar
[DEBUG] 09:49:30.880 D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar
[DEBUG] 09:49:30.880 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar
[DEBUG] 09:49:30.880 D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.881 D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.881 D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.881 D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.881 D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.881 D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.882 D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.882 D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar
[DEBUG] 09:49:30.882 D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar
[DEBUG] 09:49:30.882 D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar
[DEBUG] 09:49:30.883 D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar
[DEBUG] 09:49:30.883 D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar
[DEBUG] 09:49:30.883 D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar
[DEBUG] 09:49:30.883 D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.884 D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.884 D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.884 D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar
[DEBUG] 09:49:30.884 D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar
[DEBUG] 09:49:30.884 D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.885 D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.885 D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.885 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar
[DEBUG] 09:49:30.886 D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar
[DEBUG] 09:49:30.886 D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar
[DEBUG] 09:49:30.886 -----
[DEBUG] 09:49:30.931 ----- Classpath analyzed by Squid:
[DEBUG] 09:49:30.931 D:\github\springboot2-mybatis\target\classes
[DEBUG] 09:49:30.931 D:\data\maven\org\apache\commons\commons-dbcp2\2.7.0\commons-dbcp2-2.7.0.jar
[DEBUG] 09:49:30.931 D:\data\maven\org\apache\commons\commons-pool2\2.7.0\commons-pool2-2.7.0.jar
[DEBUG] 09:49:30.932 D:\data\maven\commons-logging\commons-logging\1.2\commons-logging-1.2.jar
[DEBUG] 09:49:30.932 D:\data\maven\org\projectlombok\lombok\1.18.8\lombok-1.18.8.jar
[DEBUG] 09:49:30.932 D:\data\maven\com\microsoft\sqlserver\mssql-jdbc\7.4.1.jre8\mssql-jdbc-7.4.1.jre8.jar
[DEBUG] 09:49:30.932 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-starter\2.1.0\mybatis-spring-boot-starter-2.1.0.jar
[DEBUG] 09:49:30.932 D:\data\maven\org\springframework\boot\spring-boot-starter\2.1.6.RELEASE\spring-boot-starter-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.933 D:\data\maven\org\springframework\boot\spring-boot\2.1.6.RELEASE\spring-boot-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.933 D:\data\maven\org\springframework\spring-context\5.1.8.RELEASE\spring-context-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.933 D:\data\maven\org\springframework\spring-aop\5.1.8.RELEASE\spring-aop-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.933 D:\data\maven\org\springframework\spring-expression\5.1.8.RELEASE\spring-expression-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.934 D:\data\maven\org\springframework\boot\spring-boot-autoconfigure\2.1.6.RELEASE\spring-boot-autoconfigure-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.934 D:\data\maven\org\springframework\boot\spring-boot-starter-logging\2.1.6.RELEASE\spring-boot-starter-logging-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.934 D:\data\maven\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar
[DEBUG] 09:49:30.934 D:\data\maven\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar
[DEBUG] 09:49:30.934 D:\data\maven\org\apache\logging\log4j\log4j-to-slf4j\2.11.2\log4j-to-slf4j-2.11.2.jar
[DEBUG] 09:49:30.935 D:\data\maven\org\apache\logging\log4j\log4j-api\2.11.2\log4j-api-2.11.2.jar
[DEBUG] 09:49:30.935 D:\data\maven\org\slf4j\jul-to-slf4j\1.7.26\jul-to-slf4j-1.7.26.jar
[DEBUG] 09:49:30.935 D:\data\maven\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar
[DEBUG] 09:49:30.935 D:\data\maven\org\springframework\spring-core\5.1.8.RELEASE\spring-core-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.935 D:\data\maven\org\springframework\spring-jcl\5.1.8.RELEASE\spring-jcl-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.936 D:\data\maven\org\yaml\snakeyaml\1.23\snakeyaml-1.23.jar
[DEBUG] 09:49:30.936 D:\data\maven\org\springframework\boot\spring-boot-starter-jdbc\2.1.6.RELEASE\spring-boot-starter-jdbc-2.1.6.RELEASE.jar
[DEBUG] 09:49:30.936 D:\data\maven\com\zaxxer\HikariCP\3.2.0\HikariCP-3.2.0.jar
[DEBUG] 09:49:30.936 D:\data\maven\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar
[DEBUG] 09:49:30.937 D:\data\maven\org\springframework\spring-jdbc\5.1.8.RELEASE\spring-jdbc-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.938 D:\data\maven\org\springframework\spring-beans\5.1.8.RELEASE\spring-beans-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.938 D:\data\maven\org\springframework\spring-tx\5.1.8.RELEASE\spring-tx-5.1.8.RELEASE.jar
[DEBUG] 09:49:30.939 D:\data\maven\org\mybatis\spring\boot\mybatis-spring-boot-autoconfigure\2.1.0\mybatis-spring-boot-autoconfigure-2.1.0.jar
[DEBUG] 09:49:30.940 D:\data\maven\org\mybatis\mybatis\3.5.2\mybatis-3.5.2.jar
[DEBUG] 09:49:30.940 D:\data\maven\org\mybatis\mybatis-spring\2.0.2\mybatis-spring-2.0.2.jar
[DEBUG] 09:49:30.941 D:\data\maven\junit\junit\4.11\junit-4.11.jar
[DEBUG] 09:49:30.941 D:\data\maven\org\hamcrest\hamcrest-core\1.3\hamcrest-core-1.3.jar
[DEBUG] 09:49:30.942 -----
[INFO] 09:49:30.956 Java Main Files AST scan
[INFO] 09:49:30.958 7 source files to be analyzed
[INFO] 09:49:30.986 Load project repositories
[DEBUG] 09:49:30.997 GET 200 http://192.168.102.92:9000/batch/project.protobuf?key=com.taobao.spring%3Aspringboot2-mybatis | time=10ms
[INFO] 09:49:31.006 Load project repositories (done) | time=20ms
[DEBUG] 09:49:31.007 'src/main/java/com/taobao/spring/App.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.444 'src/main/java/com/taobao/spring/core/UserSex.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.524 'src/main/java/com/taobao/spring/core/UserStatus.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.613 'src/main/java/com/taobao/spring/entity/User.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.652 'src/main/java/com/taobao/spring/mapper/UserMapper.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.676 'src/main/java/com/taobao/spring/typehandler/UserSexTypeHandler.java' generated metadata with charset 'UTF-8'
[DEBUG] 09:49:31.732 'src/main/java/com/taobao/spring/typehandler/UserStatusTypeHandler.java' generated metadata with charset 'UTF-8'
[INFO] 09:49:31.786 7/7 source files have been analyzed
[WARNING] 09:49:31.787 Classes not found during the analysis : [javax.annotation.meta.When]
[INFO] 09:49:31.788 Java Main Files AST scan (done) | time=833ms
[INFO] 09:49:31.788 Java Test Files AST scan
[INFO] 09:49:31.789 1 source files to be analyzed
[DEBUG] 09:49:31.790 'src/test/java/com/taobao/spring/AppTest.java' generated metadata as test  with charset 'UTF-8'
[INFO] 09:49:31.820 Java Test Files AST scan (done) | time=32ms
[INFO] 09:49:31.820 Sensor JavaSquidSensor [java] (done) | time=1611ms
[INFO] 09:49:31.820 Sensor MyBatisLint Sensor [mybatis]
[INFO] 09:49:31.821 stmtIdExcludeList: []
[INFO] 09:49:31.828 1/1 source files have been analyzed
[INFO] 09:49:31.889 handle mybatis mapper xml:/D:/github/springboot2-mybatis/src/main/resources/mapper/UserMapper.xml
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 8.285 s
[INFO] Finished at: 2019-09-05T09:49:32+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar (default-cli) on project springboot2-mybatis: Error parsing Mapper XML. The XML location is 'file [D:\github\springboot2-mybatis\src\main\resources\mapper\UserMapper.xml-reduced.xml]'. Cause: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler -> [Help 1]
org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal org.sonarsource.scanner.maven:sonar-maven-plugin:3.5.0.1254:sonar (default-cli) on project springboot2-mybatis: Error parsing Mapper XML. The XML location is 'file [D:\github\springboot2-mybatis\src\main\resources\mapper\UserMapper.xml-reduced.xml]'. Cause: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:213)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
Caused by: org.apache.maven.plugin.MojoExecutionException: Error parsing Mapper XML. The XML location is 'file [D:\github\springboot2-mybatis\src\main\resources\mapper\UserMapper.xml-reduced.xml]'. Cause: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.sonarsource.scanner.maven.bootstrap.ScannerBootstrapper.execute (ScannerBootstrapper.java:67)
    at org.sonarsource.scanner.maven.SonarQubeMojo.execute (SonarQubeMojo.java:104)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:208)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
Caused by: org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. The XML location is 'file [D:\github\springboot2-mybatis\src\main\resources\mapper\UserMapper.xml-reduced.xml]'. Cause: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement (XMLMapperBuilder.java:122)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.parse (XMLMapperBuilder.java:94)
    at org.sonarsource.plugins.mybatis.rules.MyBatisLintSensor.execute (MyBatisLintSensor.java:129)
    at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse (AbstractSensorWrapper.java:48)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:85)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.lambda$execute$1 (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.withModuleStrategy (ModuleSensorsExecutor.java:77)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.scan.ModuleScanContainer.doAfterStart (ModuleScanContainer.java:82)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.scan.ProjectScanContainer.scan (ProjectScanContainer.java:400)
    at org.sonar.scanner.scan.ProjectScanContainer.scanRecursively (ProjectScanContainer.java:395)
    at org.sonar.scanner.scan.ProjectScanContainer.doAfterStart (ProjectScanContainer.java:358)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.bootstrap.GlobalContainer.doAfterStart (GlobalContainer.java:141)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.batch.bootstrapper.Batch.doExecute (Batch.java:73)
    at org.sonar.batch.bootstrapper.Batch.execute (Batch.java:67)
    at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute (BatchIsolatedLauncher.java:46)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke (IsolatedLauncherProxy.java:60)
    at com.sun.proxy.$Proxy31.execute (Unknown Source)
    at org.sonarsource.scanner.api.EmbeddedScanner.doExecute (EmbeddedScanner.java:171)
    at org.sonarsource.scanner.api.EmbeddedScanner.execute (EmbeddedScanner.java:128)
    at org.sonarsource.scanner.maven.bootstrap.ScannerBootstrapper.execute (ScannerBootstrapper.java:65)
    at org.sonarsource.scanner.maven.SonarQubeMojo.execute (SonarQubeMojo.java:104)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:208)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
Caused by: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.apache.ibatis.builder.BaseBuilder.resolveClass (BaseBuilder.java:118)
    at org.apache.ibatis.builder.BaseBuilder.resolveTypeHandler (BaseBuilder.java:126)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.buildParameterMapping (SqlSourceBuilder.java:121)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.handleToken (SqlSourceBuilder.java:67)
    at org.apache.ibatis.parsing.GenericTokenParser.parse (GenericTokenParser.java:78)
    at org.apache.ibatis.builder.SqlSourceBuilder.parse (SqlSourceBuilder.java:45)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:46)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:40)
    at org.apache.ibatis.scripting.xmltags.XMLScriptBuilder.parseScriptNode (XMLScriptBuilder.java:72)
    at org.apache.ibatis.scripting.xmltags.XMLLanguageDriver.createSqlSource (XMLLanguageDriver.java:44)
    at org.apache.ibatis.builder.xml.XMLStatementBuilder.parseStatementNode (XMLStatementBuilder.java:96)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:137)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:130)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement (XMLMapperBuilder.java:120)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.parse (XMLMapperBuilder.java:94)
    at org.sonarsource.plugins.mybatis.rules.MyBatisLintSensor.execute (MyBatisLintSensor.java:129)
    at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse (AbstractSensorWrapper.java:48)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:85)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.lambda$execute$1 (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.withModuleStrategy (ModuleSensorsExecutor.java:77)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.scan.ModuleScanContainer.doAfterStart (ModuleScanContainer.java:82)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.scan.ProjectScanContainer.scan (ProjectScanContainer.java:400)
    at org.sonar.scanner.scan.ProjectScanContainer.scanRecursively (ProjectScanContainer.java:395)
    at org.sonar.scanner.scan.ProjectScanContainer.doAfterStart (ProjectScanContainer.java:358)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.bootstrap.GlobalContainer.doAfterStart (GlobalContainer.java:141)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.batch.bootstrapper.Batch.doExecute (Batch.java:73)
    at org.sonar.batch.bootstrapper.Batch.execute (Batch.java:67)
    at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute (BatchIsolatedLauncher.java:46)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke (IsolatedLauncherProxy.java:60)
    at com.sun.proxy.$Proxy31.execute (Unknown Source)
    at org.sonarsource.scanner.api.EmbeddedScanner.doExecute (EmbeddedScanner.java:171)
    at org.sonarsource.scanner.api.EmbeddedScanner.execute (EmbeddedScanner.java:128)
    at org.sonarsource.scanner.maven.bootstrap.ScannerBootstrapper.execute (ScannerBootstrapper.java:65)
    at org.sonarsource.scanner.maven.SonarQubeMojo.execute (SonarQubeMojo.java:104)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:208)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
Caused by: org.apache.ibatis.type.TypeException: Could not resolve type alias 'com.taobao.spring.typehandler.UserStatusTypeHandler'.  Cause: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.apache.ibatis.type.TypeAliasRegistry.resolveAlias (TypeAliasRegistry.java:120)
    at org.apache.ibatis.builder.BaseBuilder.resolveAlias (BaseBuilder.java:149)
    at org.apache.ibatis.builder.BaseBuilder.resolveClass (BaseBuilder.java:116)
    at org.apache.ibatis.builder.BaseBuilder.resolveTypeHandler (BaseBuilder.java:126)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.buildParameterMapping (SqlSourceBuilder.java:121)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.handleToken (SqlSourceBuilder.java:67)
    at org.apache.ibatis.parsing.GenericTokenParser.parse (GenericTokenParser.java:78)
    at org.apache.ibatis.builder.SqlSourceBuilder.parse (SqlSourceBuilder.java:45)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:46)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:40)
    at org.apache.ibatis.scripting.xmltags.XMLScriptBuilder.parseScriptNode (XMLScriptBuilder.java:72)
    at org.apache.ibatis.scripting.xmltags.XMLLanguageDriver.createSqlSource (XMLLanguageDriver.java:44)
    at org.apache.ibatis.builder.xml.XMLStatementBuilder.parseStatementNode (XMLStatementBuilder.java:96)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:137)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:130)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement (XMLMapperBuilder.java:120)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.parse (XMLMapperBuilder.java:94)
    at org.sonarsource.plugins.mybatis.rules.MyBatisLintSensor.execute (MyBatisLintSensor.java:129)
    at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse (AbstractSensorWrapper.java:48)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:85)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.lambda$execute$1 (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.withModuleStrategy (ModuleSensorsExecutor.java:77)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.scan.ModuleScanContainer.doAfterStart (ModuleScanContainer.java:82)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.scan.ProjectScanContainer.scan (ProjectScanContainer.java:400)
    at org.sonar.scanner.scan.ProjectScanContainer.scanRecursively (ProjectScanContainer.java:395)
    at org.sonar.scanner.scan.ProjectScanContainer.doAfterStart (ProjectScanContainer.java:358)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.bootstrap.GlobalContainer.doAfterStart (GlobalContainer.java:141)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.batch.bootstrapper.Batch.doExecute (Batch.java:73)
    at org.sonar.batch.bootstrapper.Batch.execute (Batch.java:67)
    at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute (BatchIsolatedLauncher.java:46)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke (IsolatedLauncherProxy.java:60)
    at com.sun.proxy.$Proxy31.execute (Unknown Source)
    at org.sonarsource.scanner.api.EmbeddedScanner.doExecute (EmbeddedScanner.java:171)
    at org.sonarsource.scanner.api.EmbeddedScanner.execute (EmbeddedScanner.java:128)
    at org.sonarsource.scanner.maven.bootstrap.ScannerBootstrapper.execute (ScannerBootstrapper.java:65)
    at org.sonarsource.scanner.maven.SonarQubeMojo.execute (SonarQubeMojo.java:104)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:208)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
Caused by: java.lang.ClassNotFoundException: Cannot find class: com.taobao.spring.typehandler.UserStatusTypeHandler
    at org.apache.ibatis.io.ClassLoaderWrapper.classForName (ClassLoaderWrapper.java:200)
    at org.apache.ibatis.io.ClassLoaderWrapper.classForName (ClassLoaderWrapper.java:89)
    at org.apache.ibatis.io.Resources.classForName (Resources.java:261)
    at org.apache.ibatis.type.TypeAliasRegistry.resolveAlias (TypeAliasRegistry.java:116)
    at org.apache.ibatis.builder.BaseBuilder.resolveAlias (BaseBuilder.java:149)
    at org.apache.ibatis.builder.BaseBuilder.resolveClass (BaseBuilder.java:116)
    at org.apache.ibatis.builder.BaseBuilder.resolveTypeHandler (BaseBuilder.java:126)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.buildParameterMapping (SqlSourceBuilder.java:121)
    at org.apache.ibatis.builder.SqlSourceBuilder$ParameterMappingTokenHandler.handleToken (SqlSourceBuilder.java:67)
    at org.apache.ibatis.parsing.GenericTokenParser.parse (GenericTokenParser.java:78)
    at org.apache.ibatis.builder.SqlSourceBuilder.parse (SqlSourceBuilder.java:45)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:46)
    at org.apache.ibatis.scripting.defaults.RawSqlSource.<init> (RawSqlSource.java:40)
    at org.apache.ibatis.scripting.xmltags.XMLScriptBuilder.parseScriptNode (XMLScriptBuilder.java:72)
    at org.apache.ibatis.scripting.xmltags.XMLLanguageDriver.createSqlSource (XMLLanguageDriver.java:44)
    at org.apache.ibatis.builder.xml.XMLStatementBuilder.parseStatementNode (XMLStatementBuilder.java:96)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:137)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext (XMLMapperBuilder.java:130)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement (XMLMapperBuilder.java:120)
    at org.apache.ibatis.builder.xml.XMLMapperBuilder.parse (XMLMapperBuilder.java:94)
    at org.sonarsource.plugins.mybatis.rules.MyBatisLintSensor.execute (MyBatisLintSensor.java:129)
    at org.sonar.scanner.sensor.AbstractSensorWrapper.analyse (AbstractSensorWrapper.java:48)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:85)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.lambda$execute$1 (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.withModuleStrategy (ModuleSensorsExecutor.java:77)
    at org.sonar.scanner.sensor.ModuleSensorsExecutor.execute (ModuleSensorsExecutor.java:59)
    at org.sonar.scanner.scan.ModuleScanContainer.doAfterStart (ModuleScanContainer.java:82)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.scan.ProjectScanContainer.scan (ProjectScanContainer.java:400)
    at org.sonar.scanner.scan.ProjectScanContainer.scanRecursively (ProjectScanContainer.java:395)
    at org.sonar.scanner.scan.ProjectScanContainer.doAfterStart (ProjectScanContainer.java:358)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.scanner.bootstrap.GlobalContainer.doAfterStart (GlobalContainer.java:141)
    at org.sonar.core.platform.ComponentContainer.startComponents (ComponentContainer.java:136)
    at org.sonar.core.platform.ComponentContainer.execute (ComponentContainer.java:122)
    at org.sonar.batch.bootstrapper.Batch.doExecute (Batch.java:73)
    at org.sonar.batch.bootstrapper.Batch.execute (Batch.java:67)
    at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute (BatchIsolatedLauncher.java:46)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke (IsolatedLauncherProxy.java:60)
    at com.sun.proxy.$Proxy31.execute (Unknown Source)
    at org.sonarsource.scanner.api.EmbeddedScanner.doExecute (EmbeddedScanner.java:171)
    at org.sonarsource.scanner.api.EmbeddedScanner.execute (EmbeddedScanner.java:128)
    at org.sonarsource.scanner.maven.bootstrap.ScannerBootstrapper.execute (ScannerBootstrapper.java:65)
    at org.sonarsource.scanner.maven.SonarQubeMojo.execute (SonarQubeMojo.java:104)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:208)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:154)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:146)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:117)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:81)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:56)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:128)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:305)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:192)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:105)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:956)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:290)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:194)
    at sun.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:498)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:289)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:229)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:415)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:356)
[ERROR] 
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
