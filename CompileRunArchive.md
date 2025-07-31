## Compile, Run and Archive notes
#### To compile
This will output .class files.
<br>
`javac [path/to/file/][filename].java [optional additional java files]`
<br> or <br>
`javac [packagename]/*.java` to compile the whole package. <br>
Use `-d` flag for javac to put the classes in another directory.
<br>
#### To run
`java [class name]`
<br>
Then use
`java -classpath classes [class name]`
If you have dependencies
`java -classpath ".:[classpath of dependencies]:[other dep classpath]" myPackage.MyApp`
<br>
#### Make jars
`jar -cvf myJarName.jar .`
<br> From files in custom folder
`jar -cvf newJarFile.jar -C myFolder`
<br> `-c` is `--create --verbose --file`