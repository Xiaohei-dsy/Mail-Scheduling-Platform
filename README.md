# Mail-Scheduling-Platform

Features of works:
Ordinary users can access the web interface to realize automatic sending and management of mail timing and delay.
For developers, developers can easily integrate it into their own projects, so that the business involving email in the project becomes extremely simple.

Technical features:
(1) Use Redis to pull the connected application to prevent the server from being disconnected and lost (otherwise, the client application needs to poll and send a request to the server to access). Realize secondary application information storage.
(2) Use Quartz to realize customized management of sending email tasks
(3) Use JavaMail to send mail on any platform
(4) Set up the log secondary storage mechanism, first use the memory to cache the log, and then periodically divide the log records and store them as files
(5) RPC remote call to achieve application decoupling
