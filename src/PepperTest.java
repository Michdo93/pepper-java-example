import com.aldebaran.qi.*;
import com.aldebaran.qi.Application;
import com.aldebaran.qi.helper.*;
import com.aldebaran.qi.helper.proxies.*;

public class PepperTest {
    private String ip_address;
    private int port;
    private String robotURL;
    private Session session;
    private com.aldebaran.qi.Application application;/*
    private ALRobotPosture postureService;
    private ALMotion motionService;
    private ALTracker trackerService;*/
    private ALAnimatedSpeech ttsService;/*
    private ALTabletService tabletService;
    private ALAutonomousLife autonomousLifeService;
    private ALSystem alSystemService;
    private ALNavigation alNavigationService;
    private ALBattery alBatteryService;
    private ALBasicAwareness awarenessService;
    private ALLeds ledService;
    private ALAudioDevice audioDevice;
    private ALVideoDevice cameraDevice;
    private ALFaceDetection faceDetectionService;
    private ALMemory memoryService;
    private ALAudioPlayer audioService;
    private ALAnimationPlayer animationService;
    private ALBehaviorManager behaviorManagerService;
    private ALFaceCharacteristics faceCharacteristics;
    private ALPeoplePerception peoplePerception;
    private ALSpeechRecognition speechService;
    private ALDialog dialogService;
    private ALAudioRecorder audioRecorder;*/
    
    public PepperTest(String ip_address, int port, Application application) {
        this.ip_address = ip_address;
        this.port = port;
        
        this.robotURL = "tcp://" + this.ip_address + ":" + Integer.toString(this.port);

        this.application = application;
        this.session = this.application.session();
        
        try {
	        /*
	        this.postureService = new ALRobotPosture(this.session);
	        this.motionService = new ALMotion(this.session);
	        this.trackerService = new ALTracker(this.session);*/
	        this.ttsService = new ALAnimatedSpeech(this.session);/*
	        this.tabletService = new ALTabletService(this.session);
	        this.autonomousLifeService = new ALAutonomousLife(this.session);
	        this.alSystemService = new ALSystem(this.session);
	        this.alNavigationService = new ALNavigation(this.session);
	        this.alBatteryService = new ALBattery(this.session);
	        this.awarenessService = new ALBasicAwareness(this.session);
	        this.ledService = new ALLeds(this.session);
	        this.audioDevice = new ALAudioDevice(this.session);
	        this.cameraDevice = new ALVideoDevice(this.session);
	        this.faceDetectionService = new ALFaceDetection(this.session);
	        this.memoryService = new ALMemory(this.session);
	        this.audioService = new ALAudioPlayer(this.session);
	        this.animationService = new ALAnimationPlayer(this.session);
	        this.behaviorManagerService = new ALBehaviorManager(this.session);
	        this.faceCharacteristics = new ALFaceCharacteristics(this.session);
	        this.peoplePerception = new ALPeoplePerception(this.session);
	        this.speechService = new ALSpeechRecognition(this.session);
	        this.dialogService = new ALDialog(this.session);
	        this.audioRecorder = new ALAudioRecorder(this.session);
	         */
	        this.ttsService.say("Hello World!");
        } catch(Exception e){
            // The application could not be started.
            e.printStackTrace();
        }
    }
    
	public static void main(String[] args) {
        String ip_address = "192.168.0.41";
        int port = 9559;
		
	    String robotUrl = "tcp://" + ip_address + ":" + port;
	    
	    Application application = new Application(args, robotUrl);
	    application.start();
	    
	    PepperTest test = new PepperTest(ip_address, port, application);
	    
	    application.run();
	}

}