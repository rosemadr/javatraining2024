## Compile, Run and Archive notes
#### to compile
`javac [path/to/file/][filename].java [optional additional java files]`
<br> or <br>
`javac [packagename]/*.java` <br>
use `-d` flag for javac to put the classes in another directory
This will output .class files
#### for whole package
`javac [packagename]/*.java`

<br>

#### to run
`java [class name]`
<br>
then use
`java -classpath classes [class name]`
if you have dependencies
`java -classpath ".:[classpath of dependencies]:[other dep classpath]" myPackage.MyApp`
<br>
make jars: `jar -cvf myJarName.jar .`
<br> From files in custom folder
`jar -cvf newJarFile.jar -C myFolder`
<br> `-c` is `--create --verbose --file`