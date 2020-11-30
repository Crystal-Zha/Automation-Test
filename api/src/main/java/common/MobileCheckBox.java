package common;

import org.openqa.selenium.WebElement;

public class MobileCheckBox extends CustomMobileElement {

        protected MobileCheckBox(WebElement element) {
            super(element);
        }

        public void click(){
            getElement().click();
        }

        public void turn(boolean on) {
            if (on) {
                getElement().click();
            }
        }

        public String getText() {
            return getElement().getText();
        }

        public boolean isDisabled(){
            return !getElement().isEnabled();
        }

        public String isChecked() {
            return getElement().getAttribute("checked");
        }
    }


