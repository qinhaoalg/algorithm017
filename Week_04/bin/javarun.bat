set name=%~n1
set cpoption=-cp .;..\libs\junit-4.3.jar;%CLASSPATH%
javac %cpoption% %name%.java && ^
java %cpoption% %name%
