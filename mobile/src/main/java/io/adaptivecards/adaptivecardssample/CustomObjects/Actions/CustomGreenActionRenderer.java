package io.adaptivecards.adaptivecardssample.CustomObjects.Actions;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import android.widget.Button;

import io.adaptivecards.adaptivecardssample.R;
import io.adaptivecards.objectmodel.BaseActionElement;
import io.adaptivecards.objectmodel.HostConfig;
import io.adaptivecards.renderer.BaseActionElementRenderer;
import io.adaptivecards.renderer.RenderArgs;
import io.adaptivecards.renderer.RenderedAdaptiveCard;
import io.adaptivecards.renderer.actionhandler.ICardActionHandler;

public class CustomGreenActionRenderer extends BaseActionElementRenderer
{
    public CustomGreenActionRenderer(Activity activity)
    {
        m_activity = activity;
    }

    @Override
    public Button render(RenderedAdaptiveCard renderedCard,
                         Context context,
                         FragmentManager fragmentManager,
                         ViewGroup viewGroup,
                         BaseActionElement baseActionElement,
                         ICardActionHandler cardActionHandler,
                         HostConfig hostConfig,
                         RenderArgs renderArgs)
    {
        Button greenActionButton = new Button(context);

        CustomGreenActionElement customAction = (CustomGreenActionElement) baseActionElement.findImplObj();

        greenActionButton.setBackgroundColor(m_activity.getResources().getColor(R.color.greenActionColor));
        greenActionButton.setText(customAction.getMessage());
        greenActionButton.setAllCaps(false);
        greenActionButton.setOnClickListener(new BaseActionElementRenderer.ActionOnClickListener(renderedCard, baseActionElement, cardActionHandler));

        viewGroup.addView(greenActionButton);

        return greenActionButton;
    }

    private Activity m_activity;
}
