using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UIElements;

public class Manager : MonoBehaviour
{
    public UIDocument UIDocument;

    Button button;

    // Start is called before the first frame update
    void Start()
    {
        button = UIDocument.rootVisualElement.Q<Button>("button");
        button.clicked += Button_onClick;
    }

    private void Button_onClick()
    {
#if UNITY_EDITOR
        Debug.Log(nameof(Button_onClick));
#else
#if UNITY_ANDROID
        using (var playerClass = new AndroidJavaClass("com.unity3d.player.UnityPlayer"))
        {
            using (var androidJavaObject = playerClass.GetStatic<AndroidJavaObject>("currentActivity"))
            {
                var ret = androidJavaObject.Call<int>("test", "testarg");
                Debug.Log($"{nameof(Button_onClick)} {ret}");
            }
        }
#endif
#endif
    }

    //// Update is called once per frame
    //void Update()
    //{

    //}
}
