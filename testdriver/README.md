#/exploitclass:

contains our payload which can be returned upon the jndi request

Compile with:

     ./compile.sh

After compiling run:

    python -m SimpleHTTPServer 8888

#/marshalsec:

contains the JNDI responder and payload marshaler

Run with:

    ./start.sh

#/testdriver:

contains a very simple vulnerable application which can be run on different environments for testing

Compile with:

    ./compile.sh

Run with:

    ./start.sh

Now you can change the VM and/or parameters to test with
