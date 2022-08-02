import org.apache.commons.lang.SystemUtils
@Grab(group='commons-lang', module='commons-lang', version='2.4')

def printInfo(){
    if(SystemUtils.isJavaVersionAtLeast(5)){
        println 'We are ready to use annotation for our groovy code.'
    }
    else{
        println 'We cannot use annotation for our groovy code.'
    }
}

printInfo()