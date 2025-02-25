package ru.mideev.midbot.command.admin.other;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Locale;

public class Information extends ListenerAdapter {
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        EmbedBuilder si = new EmbedBuilder();
        EmbedBuilder im = new EmbedBuilder();

        if (event.getChannel().getId().equals("942520425936719952") && event.getMessage().getContentDisplay().equals("info")) {
            im.setImage("https://cdn.discordapp.com/attachments/942520425936719952/1043936302854316042/information_about_channels.png");
            im.setColor(new Color(100, 114, 255));
            si.setColor(new Color(100, 114, 255));

            si.setDescription(
                    "<#988419768757420063>  - правила сервера.\n" +
                            "<#983318878258081813> - канал для получения ролей.\n" +
                            "<#941364846899900496> - новости YouTube-канала.\n" +
                            "<#989613511124590662> - список изменений и разных нововведений.\n" +
                            "<#950750830833852446> - новости этого Discord-сервера.\n" +
                            "\n" +
                            "<#941334996654911488> - основной чат для общения.\n" +
                            "<#941458443749978122> - чат для команд и прочего флуда.\n" +
                            "<#988553193933918319> - дискуссии на игровые тематики.\n" +
                            "<#1071497117530587326> - демонстрация вашего творчества.\n" +
                            "<#1096456932182736977> - канал с рабочими местами.\n" +
                            "<#1096456959663812618> - канал с рабочими столами.\n" +
                            "<#1120388399963045918> - хранилище ваших фотографий.\n" +
                            "<#1013527821085315082> - общие вопросы для всех.\n" +
                            "\n" +
                            "<#979498476452859994> - ваши идеи для Discord'а.\n" +
                            "<#1109502097914863667> - ваши идеи для YouTube-канала создателя.\n" +
                            "<#985623622293028935> - советы по принятию тех или иных решений.");
            event.getMessage().getChannel().asNewsChannel().sendMessageEmbeds(im.build(), si.build()).queue();
        }

        if (event.getChannel().getId().equals("942520425936719952") && event.getMessage().getContentDisplay().equals("info")) {
            im.setImage("https://cdn.discordapp.com/attachments/942520425936719952/1043936302514569297/information_about_roles.png");
            im.setColor(new Color(224, 99, 63));
            si.setColor(new Color(224, 99, 63));

            si.setDescription(
                    "<@&942440874690871316> - **главный господин сервера, он же <@421259943123877888>**.\n" +
                            "\n" +
                            "<@&975747225500123152> - **управляет и сопровождает сервер.**\n" +
                            "*Люди с данной ролью отвечают за персонал и порядок в целом.*\n" +
                            "<@&1119555023056150558> - **ответственный за персонал.**\n" +
                            "*Главный помощник администратора и куратор персонала сервера.*\n" +
                            "<@&975748559838281798> - **отвечает за порядок на сервере.**\n" +
                            "*Ответственненый за чат и является доверенным лицом куратора.*\n" +
                            "<@&975748559473344532> - **контролирует чат и наказывает нарушителей.**\n" +
                            "*Увидев нарушение, пингуйте роль или пишите им в ЛС.*\n" +
                            "<@&1121401763778539691> - **навигатор сервера, помогает по вопросам на сервере.**\n" +
                            "*Знают всё о сервере, смело пингуйте или пишите им в ЛС.*\n" +
                            "\n" +
                            "<@&975750629425315862> - **что-то кодит и как-то помогает этим серверу.**\n" +
                            "*Являетесь разработчиком и готовы помочь с помощью кода?*\n" +
                            "*Тогда **пишите** в **ЛС*** к <@&975747225500123152>*, **вам всё расскажут***.\n" +
                            "\n" +
                            "<@&943220825753022525> - **бустер сервера, имеет права <@&975318500648304650>.**\n" +
                            "*Каждый буст помогает улучшать сервер в каждом из направлений.*\n" +
                            "\n" +
                            "<@&975322744050831390> - **имеет доступ к журналу аудита и...**\n" +
                            "*Выдаётся при достижении **100**-го уровня.*\n" +
                            "<@&975318487448834088> - **выдает права к секретным каналам.**\n" +
                            "*Выдаётся при достижении **75**-го уровня.*\n" +
                            "<@&975318500648304650> - **открывает доступ к каналу для <@&943220825753022525>.**\n" +
                            "*Выдаётся при достижении **50**-го уровня.*\n" +
                            "<@&975318511549300776> - **даёт полномочия создавать ветки.**\n" +
                            "*Выдаётся при достижении **30**-го уровня.*\n" +
                            "<@&975474836782587945> - **позволяет создавать приватные каналы.**\n" +
                            "*Выдаётся при достижении **15**-го уровня.*\n" +
                            "<@&975837708972855326> - **разрешает пользоваться командой /__xpleaders__.**\n" +
                            "*Выдаётся при достижении **10**-го уровня.*\n" +
                            "<@&975518433821212692> -** предоставляет доступ к изменению ника.**\n" +
                            "*Выдаётся при достижении **5**-го уровня.*\n\n" +

                            "<@&941360822427467846> - **авто-выдаваемая роль при входе на сервер.**\n" +
                            "*Как @everyone, только лучше.*\n\n" +

                            "<@&975336015344566292> | <@&942467119323422820> - **cамоназначаемые гендерные роли.**\n" +
                            "*Получить их и другие роли можно в <#983318878258081813>*."
            );
            event.getMessage().getChannel().asNewsChannel().sendMessageEmbeds(im.build(), si.build()).queue();
        }
    }
}
