java -Xms512M -Xmx1536M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=384M -server -XX:+TieredCompilation -jar `dirname $0`/sbt-launch-0.12.jar "$@"
