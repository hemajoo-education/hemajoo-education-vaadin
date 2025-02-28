package org.hemajoo.education.vaadin.web.view;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.hemajoo.education.vaadin.web.layout.MainLayout;

@PageTitle("My View")
@Route(value = "my-view", layout = MainLayout.class)
@Uses(Icon.class)
public class MyViewView extends Composite<VerticalLayout>
{
    public MyViewView()
    {
        HorizontalLayout layoutRow = new HorizontalLayout();
        MenuBar menuBar = new MenuBar();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TextField textField = new TextField();
        Anchor link = new Anchor();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        link.setText("Hello Vaadin");
        link.setHref("#");
        link.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(menuBar);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutColumn3);
        getContent().add(layoutRow2);
        layoutRow2.add(textField);
        layoutRow2.add(link);
    }

    private void setMenuBarSampleData(MenuBar menuBar)
    {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }
}

