# Demo code for Orika

## Set up in Eclipse _(for the non-Eclipse initiated!)_

* Open Eclipse. Create (or use) a workspace that is NOT in the orika-demo folder if you have already cloned the repository from Github

*  From the menu, select File->Import->Git->Projects from Git, then clone from URI either from local (requires that you have already added the local repository from Git to your computer), or from Github 
  * **From Github** - Select "Clone URI", and enter https://github.com/ORCID/orika-demo.git. Also add your Github credentials (note, if you haven't set up your Github SSH keys, you'll likely have problems with this - either fix that, or use the local repo approach as listed below.
  * **From Local Repo** - Select "Local Existing Repository." Click the "Add..." Button on the left and browse to the local repository on your computer. Select the added repo, and click "next". On the next screen select "Import as General Project" and click "next." Eclipse will do a quick check, and if all os clear, click "Finish" to add the project.

* Right click on the new project in the Package Explorer of Eclipse and select Configure->Convert to Maven project. _(you'll need to wait for a moment. It's doing something, but doesn't give much feedback until it's done.)_

* Right click on the project in Eclipse and select Run As->Junit Test, to run the tests.
_NOTE: If you see the following errors, don't worry about them. It seems to be a bug within Eclipse:_

```
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```